<?php
include('config.php');
include('db.class.php');
include('thumbnail_generator.php');

if(isset($_POST['username'])) {
	$email = $_POST['username'];
	
	$db = new DB($database, $host, $user, $password);
	
	// Where the file is going to be placed
	$target_path =  "uploads/";
	
	//Add the original filename to our target path.
	$file = basename($_FILES['upload_file']['name']);
	$file = str_replace(" ", "", $file);
	
	$extensions = array('.png', '.gif', '.jpg', '.jpeg', '.JPG', '.JPEG');
	$extension = strrchr($_FILES['upload_file']['name'], '.');
	
	//check if the file is uploaded
	if(in_array($extension, $extensions)) {
	
	
		try {
			$newname = $target_path.$file;
			
			copy($_FILES['upload_file']['tmp_name'], $newname);
			
			
			//$im = new CropImage($_FILES['upload_file']['tmp_name']);
			//imagejpeg($im -> crop(250, 156));
			//createthumb('original/'.$file,'uploads/'.$file,200,200);
			//copy($im, $newname);
			
			echo $newname;
			
			$result = $db->query("SELECT * FROM user WHERE email = '$email'");
			while ($line = $db->fetchNextObject()){
				$user_id = $line->id;
				$db2 = new DB($database, $host, $user, $password);
				$ext = str_replace(".", '', $extension);
				$db2->execute("INSERT INTO documents (name, file_type, user_id) VALUES ('$file', '$ext', $user_id)");
				$doc_id = $db2->lastInsertedId();
				$db2->execute("INSERT INTO user_document (user_id, document_id) VALUES ($user_id, $doc_id)");
			}
		}
		catch(Exception $e) {
			//echo "Exception: ".$e;
			 echo "There was an error uploading the file, please try again!";
		}
		
	
	  } 
	  else {
		echo " File name : '". $_FILES['upload_file']['name'];
	  }
	 //echo $target_path.$file;
	 //$data = array('items'=>array('test'=>$response));
	//echo json_encode($data);
}
?>