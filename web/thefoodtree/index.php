<h1>Throw Control Panel</h1>
<?php
include('config.php');
include('db.class.php');


if(isset($_POST['username'])) {
	$email = $_POST['username'];
	$_SESSION['username'] = $email;			
}
if(isset($_SESSION['username'])) {
	$email = $_SESSION['username'];	
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
					
					$db3 = new DB($database, $host, $user, $password);
					$db3->query("SELECT * FROM documents WHERE id = $doc_id");
					while ($line3 = $db3->fetchNextObject()){
						echo '<img src="uploads/'.$line3->name.'" width="205px"/>';
					}
					
									
					$i++;
				}
			}
	
	
	?>
<form action="list.php" method="post">
    <input type="hidden" value="<?php echo $email?>" name="username"/>
    <input type="submit" value="Get List"/>
</form>

<form action="upload.php" method="post" enctype="multipart/form-data">
	<input type="file" name="upload_file"/>
    <input type="hidden" value="<?php echo $email?>" name="username"/>
    <input type="submit" value="Add File"/>
</form>
<?php }

else {
	?>
    <form action="index.php" method="post">
        <input type="text" value="email address you registered with" name="username"/>
        <input type="submit" value="Log In"/>
    </form>
<?php 
}
