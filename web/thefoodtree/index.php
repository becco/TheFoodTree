<h1>Control Panel</h1>
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
	?>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Ingredient ID</th>
				<th>Name</th>
				<th>Cost</th>
				<th>Category ID</th>
				<th>Date</th>
				<th>Reason</th>
				<th>Other Reason</th>
			</tr>
		</thead>
		<tbody>
	<?php
			while ($line = $db->fetchNextObject()){
				$user_id = $line->id;
				
				$db2 = new DB($database, $host, $user, $password);
				$db2->query("SELECT * FROM items");
				
				while ($line2 = $db2->fetchNextObject()){
					

					?>
					<tr>
						<td><?php echo $line2->_id; ?></td>
						<td><?php echo $line2->ingredient_id; ?></td>
						<td><?php echo $line2->name; ?></td>
						<td><?php echo $line2->total_cost; ?></td>
						<td><?php echo $line2->category_id; ?></td>
						<td><?php echo $line2->date; ?></td>
						<td><?php echo $line2->reason_id; ?></td>
						<td><?php echo $line2->other_reason_id; ?></td>
					</tr>
					<?php
									
					$i++;
				}
			}
	
	
	?>

		</tbody>
	</table>

<?php }

else {
	?>
    <form action="index.php" method="post">
        <input type="text" value="" name="username"/>
        <input type="submit" value="Log In"/>
    </form>
<?php 
}
