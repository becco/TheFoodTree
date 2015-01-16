<?php
include('config.php');
include('db.class.php');

if(isset($_POST['username'])) {
	$db = new DB($database, $host, $user, $password);
	
	$email = $_POST['username'];
	$password = $_POST['password'];
	
	
		$result = $db->query("SELECT password, id FROM user WHERE email = '$email'");
		while ($line = $db->fetchNextObject()){
			if($line->password == $password) {
				$response = $line->password;
				
			}
			else {	
				$response = "Invalid user name or password!";
				header("HTTP/1.1 401 Invalid Credentials");
			}	
		}
		header("HTTP/1.1 200 OK");

		echo $response;
	
}

?>