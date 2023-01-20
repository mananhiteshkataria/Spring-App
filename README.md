# Spring-App (This is a mock app ) actual connectivity in <a href="https://github.com/mananhiteshkataria/spring-db-app">spring-db-app</a> #
## Dependency Injection between the objects with simple and complex types ##
### You can have setter methods to supply the dependencies of simple or complex type ###

	Class MySQLDBImpl implements DBOperations
	{
		private String dbUrl;//simple type
	}
	
	class UserService
	{
		private DBOperation dbop;
	}
	
	<bean id="b1" class="com.practise.MySqlDBImpl">
		<property name="dbUrl" value ="jdbc:mysql://localhost:3306"/>
	</bean>
	
	<bean id="b2" class="com.practise.UserService">
		<property name="dbop" ref="b1" />
	</bean>
## Spring JDBC ##

-	It helps you to interact with any Relational Database 	systems like Oracle,Mysql,Derby,Sybase and so on

-	It gives you a configuration class (DriverManagerDataSource) to configure datasource information like username,password,url,driverClass,this class establishes database connection object for you using the configuration in XML

- It gives you a template class (JdbcTemplate) that uses DriverManagerDataSource to perform CRUD operations
  
### DriverManagerDataSource ###
It has 4 properties
-username
-password
-url
-driverclassName

### JdbcTemplate ###
It has a property called datasource which is referencing DriverManagerDataSource

### Steps ###
- Using Derby so configure it
- Project with dependencies - spring-context,spring-jdbcm derby-client
	- Employee class - id ,name & salary
- Interface EmployeeDao 
- Implementation EmployeeDaoImpl
- Employee Service Class
- XML Configuration
	- DriverManagerDataSource - username , password, url, driverClassName
	- JDBC Template - datasource
	- EmployeeDaoImpl
	- EmployeeService
- Main class that acts like Conroller
