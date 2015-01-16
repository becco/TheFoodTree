<?php
include('config.php');
include('db.class.php');

if(isset($_POST['username'])) {
	$email = $_POST['username'];
	
	$db = new DB($database, $host, $user, $password);
	//$array = array(array("id" => 1, "name" => 'aaa', "type" => "ddd"),array("id" => 2, "name" => 'aaa', "type" => "ddd"));
	$array = array();
	$result = $db->query("SELECT * FROM user WHERE email = '$email'");
	$i = 0;
			while ($line = $db->fetchNextObject()){
				$user_id = $line->id;
				
				$db2 = new DB($database, $host, $user, $password);
				//$sql = "SELECT * FROM documents a INNER JOIN user_document b USING(user_id) WHERE a.user_id = $user_id";
				$db2->query("SELECT * FROM user_document WHERE user_id = $user_id");
				
				while ($line2 = $db2->fetchNextObject()){
					$doc_id = $line2->document_id;
					//$name = $line2->name;
					//$type = $line2->file_type;
					/*$array[array(["id"] = $doc_id)];
					$array[]["name"] = $name, ["name"] = $name;
					$array = array_push_assoc($array, "id", $doc_id);
					$array = array_push_assoc($array, "name", $name);
					$array = array_push_assoc($array, "type", $type);*/
					
					//$array["id"] = $doc_id;
					//$array["name"] = $name;
					//$array["type"] = $type;
					$db3 = new DB($database, $host, $user, $password);
					$db3->query("SELECT * FROM documents WHERE id = $doc_id");
					while ($line3 = $db3->fetchNextObject()){
						$array[] = array("id" => $doc_id, "name" => $line3->name, "type" => $line3->file_type);
					}
					
					
					//$array[]["name"] = $name ["type"] = $type ["id"] = $doc_id;
					
					$i++;
				}
			}
			//print_r($array);
			header("HTTP/1.1 200 OK");
			echo json_encode($array);
			//echo '[{"id":"1","name":"aaa","type":"ddd"}]';

}

?>
