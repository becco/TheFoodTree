<?php
include('config.php');
include('db.class.php');

if(isset($_POST['name'])) {
	
	$db = new DB($database, $host, $user, $password);
	$name = $_POST['name'];
	$email = $_POST['email'];
	$password = $_POST['password'];
	
	try {
		$db->execute("INSERT INTO user (name, email, password, role_id) VALUES ('$name', '$email', '$password', 1)");
		echo 'success';
	}
	catch(Exception $e) {
		echo $e->getMessage();
	}
}

?>