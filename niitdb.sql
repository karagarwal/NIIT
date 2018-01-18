-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 06, 2017 at 06:45 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `niitdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin_info`
--

CREATE TABLE `admin_info` (
  `id` varchar(20) NOT NULL,
  `pass` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin_info`
--

INSERT INTO `admin_info` (`id`, `pass`) VALUES
('NiitAdmin', 'niit@admin');

-- --------------------------------------------------------

--
-- Table structure for table `clang`
--

CREATE TABLE `clang` (
  `ques` longtext,
  `a` longtext,
  `b` longtext,
  `c` longtext,
  `d` longtext,
  `ans` text,
  `category` int(2) DEFAULT NULL,
  `course` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `concepts clang`
--

CREATE TABLE `concepts clang` (
  `concept id` int(2) NOT NULL,
  `concept name` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `concepts clang`
--

INSERT INTO `concepts clang` (`concept id`, `concept name`) VALUES
(1, 'Working with operator and formatted I/O functions'),
(2, 'Using Arraays'),
(3, 'Pointers'),
(4, 'Working with Functions'),
(5, 'File input-output '),
(6, 'Working with file using structure'),
(7, 'Low- level input/output');

-- --------------------------------------------------------

--
-- Table structure for table `concepts cpp`
--

CREATE TABLE `concepts cpp` (
  `concept id` int(2) NOT NULL,
  `concept name` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `concepts cpp`
--

INSERT INTO `concepts cpp` (`concept id`, `concept name`) VALUES
(1, 'Creating Objects'),
(2, 'Encapsulation and Abstraction'),
(3, 'Operators and Decision-Making Constructs'),
(4, 'Arrays'),
(5, 'Functions'),
(6, 'Constructs and Destructors'),
(7, 'Polymorphism'),
(8, 'Inheritance'),
(9, 'Dyanmic Polumorphism'),
(10, 'Multiple Inheritance'),
(11, 'File Input and Output'),
(12, 'Exception Handling and Templates');

-- --------------------------------------------------------

--
-- Table structure for table `concepts dotnet`
--

CREATE TABLE `concepts dotnet` (
  `concept id` int(2) NOT NULL,
  `concept name` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `concepts dotnet`
--

INSERT INTO `concepts dotnet` (`concept id`, `concept name`) VALUES
(1, 'Working with controller and views'),
(2, 'Working with models and helper methods'),
(3, 'validating data'),
(4, 'Managing Data'),
(5, 'Using LINQ to Access Data'),
(6, 'Implementing a consistent look and fel across a MVC web application'),
(7, 'Enchasing web application using javascript'),
(8, 'Managing state and optimizing performance'),
(9, 'Controlling Access to a Web Application'),
(10, 'Deploying a web application');

-- --------------------------------------------------------

--
-- Table structure for table `concepts java`
--

CREATE TABLE `concepts java` (
  `concept id` int(2) NOT NULL,
  `concept name` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `concepts java`
--

INSERT INTO `concepts java` (`concept id`, `concept name`) VALUES
(1, 'java syntax and class review'),
(2, 'Encapsulation and Subclassing'),
(3, 'Encapsulation and Subclassing'),
(4, 'Advance Class Design'),
(5, 'Inheritance with java interface'),
(6, 'Generics and collections'),
(7, 'String Processing'),
(8, 'Exception and Assertions'),
(9, 'Java i/o Fundamental'),
(10, 'Java file i/o (nio.2)'),
(11, 'Threading'),
(12, 'concurrency'),
(13, 'building database application with JDBC'),
(14, 'Localization');

-- --------------------------------------------------------

--
-- Table structure for table `concepts php`
--

CREATE TABLE `concepts php` (
  `concept id` int(2) NOT NULL,
  `concept name` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `concepts php`
--

INSERT INTO `concepts php` (`concept id`, `concept name`) VALUES
(1, 'Configuring the PHP Environment'),
(2, 'Exploring PHP Fundamentals'),
(3, 'Controlling the Flow of a PHP Script'),
(4, 'Implementing Modulation'),
(5, 'Retriving and Validating Form Data'),
(6, 'Manipulating String Data'),
(7, 'Working with Files'),
(8, 'Managing State Information'),
(9, 'Enhancing the Performance Of a Web Application'),
(10, 'Sending an Email'),
(11, 'Implementing Object Oriented Programming Concepts'),
(12, 'Handling Errors and Exceptions'),
(13, 'Working with Databases');

-- --------------------------------------------------------

--
-- Table structure for table `cpp`
--

CREATE TABLE `cpp` (
  `ques` longtext,
  `a` longtext,
  `b` longtext,
  `c` longtext,
  `d` longtext,
  `ans` text,
  `category` int(2) DEFAULT NULL,
  `course` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cpp`
--

INSERT INTO `cpp` (`ques`, `a`, `b`, `c`, `d`, `ans`, `category`, `course`) VALUES
('Where does the object is created?', 'class', 'constructor', 'destructor', 'attributes', 'A', 1, 'CPP'),
('Encapsulations helps in', 'information hiding', 'in providing low coupling', 'in providing high cohesion', 'All the above', 'D', 2, 'CPP'),
('Which operator is having right to left associativity in the following?', 'Array subscripting', 'Function call', 'Addition and subtraction', 'Type cast', 'D', 3, 'CPP'),
(' Which of the following correctly declares an array?', ' int array[10];', ' int array;', 'array{10};', ' array array[10];', 'A', 4, 'CPP'),
('Which of the following function prototype is perfectly acceptable?', 'int Function(int Tmp = Show());', 'float Function(int Tmp = Show(int, float));', 'Both A and B.', 'float = Show(int, float) Function(Tmp);', 'A', 5, 'CPP'),
('	\nA constructor that accepts __________ parameters is called the default constructor.', 'one', 'two', 'no', 'three', 'C', 6, 'CPP'),
('Runtime polymorphism is achieved only when a virtual function is accessed through a pointer to the base class. ', 'True', 'False', 'Depend on certain cases.', ' Runtime polymorphism cannot achived in virtual function', 'A', 7, 'CPP'),
(' In case of inheritance where both base and derived class are having constructors, when an object of derived class is created then___________ . ', 'constructor of derived class will be invoked first', 'constructor of base class will be invoked first', 'constructor of derived class will be executed first followed by base class', 'constructor of base class will be executed first followed by derived class', 'D', 8, 'CPP'),
('When compiler decides binding of an overloaded member then it is called ______', ' Static binding', 'Dynamic binding', 'Local binding', 'None of these', 'A', 9, 'CPP'),
('What is meant by multiple inheritance?', ' Deriving a base class from derived class', 'Deriving a derived class from base class', 'Deriving a derived class from more than one base class', ' None of the mentioned', 'C', 10, 'CPP'),
(' Which header file is used for reading and writing to a file?', '#include<iostream>', '#include<fstream>', '#include<file>', ' None of the mentioned', 'B', 11, 'CPP'),
('To where does the program control transfers when exception is arised? catch', ' catch', 'handlers', 'throw', 'none of the mentioned', 'B', 12, 'CPP'),
(' How to access the object in the class?', ' scope resolution operator', ' ternary operator', 'direct member access operator', 'none of the mentioned', 'C', 1, 'CPP'),
(' Which of the these is the functionality of ‘Encapsulation’?', ' Binds together code and data', ' Using single interface for general class of actions.', ' Reduce Complexity ', ' All of the mentioned', 'A', 2, 'CPP'),
('Which operator is having the highest precedence?', ' postfix', ' unary', ' shift', ' equality', 'A', 3, 'CPP'),
('What is the index number of the last element of an array with 9 elements?', ' 9', ' 8', ' 0', '  Programmer-defined', 'B', 4, 'CPP'),
('Which of the following statement is correct?', ' C++ enables to define functions that take constants as an argument.', ' We cannot change the argument of the function that that are  declared as constant.', ' Both A and B', ' We cannot use the constant while defining the function.', 'C', 5, 'CPP'),
(' What happens when a class with parameterized constructors and having no default constructor is used in a program and we create an object that needs a zero-argument constructor?', ' Compile-time error.', ' Preprocessing error.', '  Runtime error.', ' Runtime exception.', 'A', 6, 'CPP'),
(' A virtual function that has no definition within the base class is called____________. ', '   Pure virtual function', '  Pure static function', '  Pure Const function', ' Friend function', 'A', 7, 'CPP'),
(' If the derived class is struct, then default visibility mode is _______ . ', ' public', ' private', ' protected ', ' struct can’t inherit class', 'A', 8, 'CPP'),
(' _____ function are bounded dynamically at run time.', ' static', ' friend', ' inline ', ' virtual', 'D', 9, 'CPP'),
(' Which symbol is used to create multiple inheritance?', ' Dot', ' Comma', ' Dollar', ' None of the mentioned', 'B', 10, 'CPP'),
(' Which member function is used to determine whether the stream object is currently associated with a file?', ' is_open', ' buf', ' string', '  None of the mentioned', 'A', 11, 'CPP'),
('  Which key word is used to check exception in the block of code?', ' catch', ' throw', ' try', ' finally', 'C', 12, 'CPP'),
(' Which of these following members are not accessed by using direct member access operator?', ' public', ' private ', ' protected', ' Both B & C', 'D', 1, 'CPP'),
(' What is ‘Basis of Encapsulation’?', ' objects', ' class', ' methods ', ' All of the mentioned', 'D', 2, 'CPP'),
('  What is this operator called     ( ) ?        :       ;   ?', ' conditional', ' relational', ' casting operator', ' none of the mentioned', 'A', 3, 'CPP'),
(' Which of the following gives the memory address of the first element in array? ', '  array[0];', '  array[1];', ' array;', ' Not Possible', 'C', 4, 'CPP'),
(' Which of the following statement is correct?', ' Overloaded functions can have at most one default argument.', ' An overloaded function cannot have default argument.', ' All arguments of an overloaded function can be default.', ' A function if overloaded more than once cannot have default argument.', 'C', 5, 'CPP'),
(' Destructor has the same name as the constructor and it is preceded by ______ .', ' !', ' #', ' ~', ' $', 'C', 6, 'CPP'),
('  When a virtual function is redefined by the derived class, it is called___________. ', ' Overloading', ' Overriding', ' Rewriting', ' All of these', 'B', 7, 'CPP'),
('  In case of inheritance where both base and derived class are having constructor and destructor, then which if the following are true ?\n\n1. Constructors are executed in their order of derivation\n2. Constructors are executed in reverse order of derivation\n3. Destructors are executed in their order of derivation\n4. Destructors are executed in reverse order of derivation ', '  Only 2 ,4', ' Only 1 , 3', ' Only 1 , 4', '  Only 2, 3', 'C', 8, 'CPP'),
(' Choose the correct statement.', '  An abstract base class can have pure virtual destructor', ' An abstract base class can have virtual destructor', ' An abstract base class can have non virtual destructor', ' An abstract base class cannot destructor', 'D', 9, 'CPP'),
(' Which of the following advantages we lose by using multiple inheritance?', ' Dynamic binding', '  Polymorphism', '  Both a & b', ' None of the mentioned', 'C', 10, 'CPP'),
(' By default, all the files are opened in ___________mode . ', ' Binary', ' Text', ' dat', ' cant say', 'B', 11, 'CPP'),
(' What will happen when the handler is not found for exception?', ' Calls the standard library function terminate()', ' raise an error', '  executes the remaining block', ' none of the mentioned', 'A', 12, 'CPP'),
(' Pick out the other definition of objects', ' member of the class', ' Associate of the class', ' attribute of the class', ' instance of the class', 'D', 1, 'CPP'),
(' Which of the following is a mechanism by which object acquires the properties of another object?', ' Encapsulation', '  Abstraction', ' Inheritance', '  Polymorphism', 'C', 2, 'CPP'),
(' What is the use of dynamic_cast operator?', ' it converts virtual base class to derived class', ' It converts virtual base object to derived objeccts', ' It will convert the operator based on precedence', '  None of the mentioned', 'A', 3, 'CPP'),
(' What is a array?', ' An array is a series of elements of the same type in contiguous memory locations', ' An array is a series of element', ' An array is a series of elements of the same type placed in non-contiguous memory locations', ' None of the mentioned', 'A', 4, 'CPP'),
(' Which of the following statement will be correct if the function has three arguments passed to it?', ' The trailing argument will be the default argument.', ' The first argument will be the default argument.', ' The middle argument will be the default argument.', ' All the argument will be the default argument.', 'A', 5, 'CPP'),
(' Constructors __________ to allow different approaches of object construction.', ' cannot overloaded', ' Can be overloaded', ' can be called', ' Can be nested', 'B', 6, 'CPP'),
('  Which of the following concept is often expressed by the phrase, ‘One interface, multiple methods’?', ' Abstraction', '  Polymorphism', ' Inheritance', '  Encapsulation', 'B', 7, 'CPP'),
('  What is the difference between protected and private access specifiers in inheritance? ', '  private member is not inheritable and not accessible in derived class.', ' protected member is inheritable and also accessible in derived class.', ' Both are inheritable but private is accessible in the derived class.', '  Both are inheritable but protected is not accessible in the derived class', 'B', 8, 'CPP'),
('  The keyword virtual indicates that ________.', ' more than one base class exists', ' base class should be used only once in inheritance', ' a derived class has public access to base class', ' none of these', 'B', 9, 'CPP'),
(' When two or more classes serve as base class for a derived class, the situation is known as __________.', ' polymorphism', ' hierarchical inheritance', ' multiple inheritance', ' none of these', 'C', 10, 'CPP'),
('Which of the following is not used to seek a file pointer? ', ' ios::cur', ' ios::set', '  ios::end', ' ios::beg', 'B', 11, 'CPP'),
(' What will happen when the exception is not caught in the program?', ' error', ' program will execute', ' block of that code will not execute', ' none of the mentioned', 'A', 12, 'CPP');

-- --------------------------------------------------------

--
-- Table structure for table `dotnet`
--

CREATE TABLE `dotnet` (
  `ques` longtext,
  `a` longtext,
  `b` longtext,
  `c` longtext,
  `d` longtext,
  `ans` text,
  `category` int(2) DEFAULT NULL,
  `course` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `java`
--

CREATE TABLE `java` (
  `ques` longtext,
  `a` text,
  `b` text,
  `c` text,
  `d` text,
  `ans` text,
  `category` int(2) NOT NULL,
  `course` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `php`
--

CREATE TABLE `php` (
  `ques` longtext,
  `a` longtext,
  `b` longtext,
  `c` longtext,
  `d` longtext,
  `ans` text,
  `category` int(2) DEFAULT NULL,
  `course` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `php`
--

INSERT INTO `php` (`ques`, `a`, `b`, `c`, `d`, `ans`, `category`, `course`) VALUES
('php	', 'b', 'a', 'd', 'c', 'A', 3, 'Php');

-- --------------------------------------------------------

--
-- Table structure for table `result clang`
--

CREATE TABLE `result clang` (
  `id` varchar(20) DEFAULT NULL,
  `time` text NOT NULL,
  `date` text NOT NULL,
  `scoreC1` text,
  `scoreC2` text,
  `scoreC3` text,
  `scoreC4` text,
  `scoreC5` text,
  `scoreC6` text,
  `scoreC7` text,
  `totalScore` text,
  `totalQuestions` text NOT NULL,
  `attemptedQues` text NOT NULL,
  `incorrectQues` text NOT NULL,
  `correctQues` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `result clang`
--

INSERT INTO `result clang` (`id`, `time`, `date`, `scoreC1`, `scoreC2`, `scoreC3`, `scoreC4`, `scoreC5`, `scoreC6`, `scoreC7`, `totalScore`, `totalQuestions`, `attemptedQues`, `incorrectQues`, `correctQues`) VALUES
('s1234', '12:30:PM', 'Mon 05/30/16', '67.0 %', '0', '0', '0', '0.0 %', '0.0 %', '0', '50.0 %', '10', '9', '4', '5'),
('s1234', '04:38:PM', 'Mon 05/38/16', '0', '0', '0', '0', '0', '0.0 %', '0', '83.0 %', '6', '5', '0', '5'),
('s1234', '04:01:PM', 'Tue 06/01/16', '0.0 %', '0', '0', '0', '0', '0.0 %', '0', '0.0 %', '6', '0', '0', '0'),
('s1234', '09:29:AM', 'Thu 08/29/16', '0', '0', '0', '0.0 %', '0.0 %', '0.0 %', '0.0 %', '20.0 %', '10', '8', '6', '2'),
('s1234', '02:30:PM', 'Thu 22/30/16', '0', '0', '0', '0', '0.0 %', '0.0 %', '0.0 %', '0.0 %', '6', '0', '0', '0'),
('s123456789012', '12:42:PM', 'Mon 26/42/16', '0', '0', '0', '0.0 %', '0.0 %', '0.0 %', '100.0 %', '67.0 %', '6', '5', '1', '4'),
('s123456789012', '04:47:PM', 'Tue 27/47/16', '0', '0', '0', '0', '0', '0.0 %', '0.0 %', '17.0 %', '6', '1', '0', '1'),
('s123456789012', '08:14:AM', 'Wed 28/14/16', '0', '0', '0', '0.0 %', '0.0 %', '0.0 %', '0.0 %', '0.0 %', '6', '1', '1', '0');

-- --------------------------------------------------------

--
-- Table structure for table `result cpp`
--

CREATE TABLE `result cpp` (
  `id` varchar(20) DEFAULT NULL,
  `time` text NOT NULL,
  `date` text NOT NULL,
  `scoreC1` text,
  `scoreC2` text,
  `scoreC3` text,
  `scoreC4` text,
  `scoreC5` text,
  `scoreC6` text,
  `scoreC7` text,
  `scoreC8` text,
  `scoreC9` text,
  `scoreC10` text,
  `scoreC11` text,
  `scoreC12` text,
  `totalScore` text,
  `totalQuestions` text NOT NULL,
  `attemptedQues` text NOT NULL,
  `incorrectQues` text NOT NULL,
  `correctQues` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `result cpp`
--

INSERT INTO `result cpp` (`id`, `time`, `date`, `scoreC1`, `scoreC2`, `scoreC3`, `scoreC4`, `scoreC5`, `scoreC6`, `scoreC7`, `scoreC8`, `scoreC9`, `scoreC10`, `scoreC11`, `scoreC12`, `totalScore`, `totalQuestions`, `attemptedQues`, `incorrectQues`, `correctQues`) VALUES
('s1234', '04:33:PM', 'Tue 06/33/16', '0', '0', '0', '0.0 %', '0', '0', '0.0 %', '0.0 %', '0.0 %', '0', '0', '0', '0.0 %', '6', '0', '0', '0'),
('s123456789012', '08:38:AM', 'Tue 27/38/16', '0', '0', '0', '0.0 %', '0', '0', '0.0 %', '0.0 %', '0.0 %', '0', '0', '0', '0.0 %', '6', '1', '1', '0'),
('s123456789012', '08:45:AM', 'Tue 27/45/16', '0', '0', '0', '0', '0', '0', '0.0 %', '0.0 %', '0.0 %', '0', '0', '0', '0.0 %', '6', '1', '1', '0'),
('s123456789012', '10:56:AM', 'Tue 27/56/16', '0', '0', '0', '0', '0', '0', '0.0 %', '0', '0.0 %', '0', '0', '0', '0.0 %', '6', '1', '1', '0'),
('s123456789012', '11:07:PM', 'Tue 27/07/16', '0', '0', '0', '0', '0', '0', '0', '0.0 %', '0.0 %', '0.0 %', '0', '0', '0.0 %', '6', '1', '1', '0'),
('s123456789012', '09:38:AM', 'Wed 28/38/16', '0', '0', '0', '0.0 %', '0', '0', '0.0 %', '0.0 %', '0.0 %', '0', '0', '0', '17.0 %', '6', '4', '3', '1');

-- --------------------------------------------------------

--
-- Table structure for table `result dotnet`
--

CREATE TABLE `result dotnet` (
  `id` varchar(20) DEFAULT NULL,
  `time` text NOT NULL,
  `date` text NOT NULL,
  `scoreC1` text,
  `scoreC2` text,
  `scoreC3` text,
  `scoreC4` text,
  `scoreC5` text,
  `scoreC6` text,
  `scoreC7` text,
  `totalScore` text,
  `totalQuestions` text NOT NULL,
  `attemptedQues` text NOT NULL,
  `incorrectQues` text NOT NULL,
  `correctQues` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `result dotnet`
--

INSERT INTO `result dotnet` (`id`, `time`, `date`, `scoreC1`, `scoreC2`, `scoreC3`, `scoreC4`, `scoreC5`, `scoreC6`, `scoreC7`, `totalScore`, `totalQuestions`, `attemptedQues`, `incorrectQues`, `correctQues`) VALUES
('s1234', '12:17:PM', 'Mon 05/17/16', '0', '0', '0', '0', '0', '0.0 %', '0', '17.0 %', '6', '6', '5', '1'),
('s1234', '12:18:PM', 'Mon 05/18/16', '100.0 %', '0', '0', '0', '0', '0.0 %', '0', '83.0 %', '6', '5', '0', '5'),
('s1234', '12:30:PM', 'Mon 05/30/16', '67.0 %', '0', '0', '0', '0.0 %', '0.0 %', '0', '50.0 %', '10', '9', '4', '5'),
('s1234', '04:38:PM', 'Mon 05/38/16', '0', '0', '0', '0', '0', '0.0 %', '0', '83.0 %', '6', '5', '0', '5'),
('s1234', '04:01:PM', 'Tue 06/01/16', '0.0 %', '0', '0', '0', '0', '0.0 %', '0', '0.0 %', '6', '0', '0', '0');

-- --------------------------------------------------------

--
-- Table structure for table `result java`
--

CREATE TABLE `result java` (
  `id` varchar(20) DEFAULT NULL,
  `time` text NOT NULL,
  `date` text NOT NULL,
  `scoreC1` text,
  `scoreC2` text,
  `scoreC3` text,
  `scoreC4` text,
  `scoreC5` text,
  `scoreC6` text,
  `scoreC7` text,
  `scoreC8` text,
  `scoreC9` text,
  `scoreC10` text,
  `scoreC11` text,
  `scoreC12` text,
  `scoreC13` text,
  `scoreC14` text,
  `totalScore` text,
  `totalQuestions` text NOT NULL,
  `attemptedQues` text NOT NULL,
  `incorrectQues` text NOT NULL,
  `correctQues` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `result java`
--

INSERT INTO `result java` (`id`, `time`, `date`, `scoreC1`, `scoreC2`, `scoreC3`, `scoreC4`, `scoreC5`, `scoreC6`, `scoreC7`, `scoreC8`, `scoreC9`, `scoreC10`, `scoreC11`, `scoreC12`, `scoreC13`, `scoreC14`, `totalScore`, `totalQuestions`, `attemptedQues`, `incorrectQues`, `correctQues`) VALUES
('null', '02:07:PM', 'Mon 05/07/16', '0', '0', '0', '0', '0.0 %', '0.0 %', '0.0 %', '0.0 %', '100.0 %', '0', '0', '0', '0', '0', '100.0 %', '6', '6', '0', '6'),
('s1234', '04:35:PM', 'Tue 06/35/16', '0', '0', '0', '0', '0', '0.0 %', '0', '0', '0', '0', '0.0 %', '0.0 %', '0.0 %', '0.0 %', '0.0 %', '6', '0', '0', '0'),
('s1234', '09:30:AM', 'Thu 08/30/16', '50.0 %', '100.0 %', '100.0 %', '0.0 %', '0', '0.0 %', '0', '0', '0', '0', '0', '0', '0', '0', '67.0 %', '6', '4', '0', '4'),
('s1234', '09:43:AM', 'Thu 08/43/16', '0', '0', '0', '0.0 %', '0.0 %', '0.0 %', '0.0 %', '0.0 %', '0.0 %', '0', '0', '0', '0', '0', '0.0 %', '10', '0', '0', '0'),
('s1234', '09:44:AM', 'Thu 08/44/16', '0', '0', '0', '0', '0', '0', '0', '0', '0.0 %', '0.0 %', '0.0 %', '0.0 %', '0.0 %', '0.0 %', '0.0 %', '6', '0', '0', '0'),
('s1234', '02:29:PM', 'Thu 22/29/16', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0.0 %', '6', '0', '0', '0'),
('s161101100086', '01:30:AM', 'Fri 23/30/16', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0.0 %', '6', '0', '0', '0'),
('null', '12:07:PM', 'Mon 26/07/16', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0.0 %', '6', '2', '2', '0'),
('null', '12:09:PM', 'Mon 26/09/16', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '0.0 %', '6', '0', '0', '0');

-- --------------------------------------------------------

--
-- Table structure for table `result php`
--

CREATE TABLE `result php` (
  `id` varchar(20) DEFAULT NULL,
  `time` text NOT NULL,
  `date` text NOT NULL,
  `scoreC1` text,
  `scoreC2` text,
  `scoreC3` text,
  `scoreC4` text,
  `scoreC5` text,
  `scoreC6` text,
  `scoreC7` text,
  `totalScore` text,
  `totalQuestions` text NOT NULL,
  `attemptedQues` text NOT NULL,
  `incorrectQues` text NOT NULL,
  `correctQues` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `result php`
--

INSERT INTO `result php` (`id`, `time`, `date`, `scoreC1`, `scoreC2`, `scoreC3`, `scoreC4`, `scoreC5`, `scoreC6`, `scoreC7`, `totalScore`, `totalQuestions`, `attemptedQues`, `incorrectQues`, `correctQues`) VALUES
('s1234', '12:17:PM', 'Mon 05/17/16', '0', '0', '0', '0', '0', '0.0 %', '0', '17.0 %', '6', '6', '5', '1'),
('s1234', '12:18:PM', 'Mon 05/18/16', '100.0 %', '0', '0', '0', '0', '0.0 %', '0', '83.0 %', '6', '5', '0', '5'),
('s1234', '12:30:PM', 'Mon 05/30/16', '67.0 %', '0', '0', '0', '0.0 %', '0.0 %', '0', '50.0 %', '10', '9', '4', '5'),
('s1234', '04:38:PM', 'Mon 05/38/16', '0', '0', '0', '0', '0', '0.0 %', '0', '83.0 %', '6', '5', '0', '5'),
('s1234', '04:01:PM', 'Tue 06/01/16', '0.0 %', '0', '0', '0', '0', '0.0 %', '0', '0.0 %', '6', '0', '0', '0');

-- --------------------------------------------------------

--
-- Table structure for table `student_info`
--

CREATE TABLE `student_info` (
  `id` varchar(20) NOT NULL,
  `pass` text NOT NULL,
  `name` text NOT NULL,
  `course` text NOT NULL,
  `dob` text NOT NULL,
  `contact` text NOT NULL,
  `mail` text NOT NULL,
  `gender` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_info`
--

INSERT INTO `student_info` (`id`, `pass`, `name`, `course`, `dob`, `contact`, `mail`, `gender`) VALUES
('s123444444444', 'sdfghjkljhgfd', 'kartik', 'CPP', '14/12/2005', '7597824223', 'dfg@gh.dfw', 'Male'),
('s123456789012', '123445678', 'gullu', 'C', '11/12/2016', '1234567890', 'g@gmail.com', 'Male'),
('s161101100086', 'password', 'kartik', 'JAVA', '23/12/2016', '7597824222', 'fdk@jbfjd.fdv', 'Male'),
('s161101100103', 'djfshdgsjfdhj', 'j g  h', 'JAVA', '14-September-2016', '4865486446', 'jhhj@fjg.vih', ''),
('s161101100104', 'hfbsdjkbgfdsg', 'dgsf jksdf ', 'JAVA', '14-September-2016', '7597824224', 'jhgfhj@jkdbf.ydgf', ''),
('S161101100105', 'dfsgjfdsgjkdfkgfg', 'dger re g', 'JAVA', '14-September-2016', '8974654687', 'rgjh@gkg.ff', ''),
('s164484651465', 'gxgdbdhgdhfhg', 'hjdsfhj', 'JAVA', '22-September-2016', '4444891572', 'vhjv@hjhj.yf', ''),
('S756767545457', '12353535365356', 'charul', 'JAVA', '14-September-2016', '1234567890', 'krtk@GMAIL.COM', '');

-- --------------------------------------------------------

--
-- Table structure for table `tempques`
--

CREATE TABLE `tempques` (
  `ques` longtext,
  `a` longtext,
  `b` longtext,
  `c` longtext,
  `d` longtext,
  `ans` text,
  `category` int(2) DEFAULT NULL,
  `course` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin_info`
--
ALTER TABLE `admin_info`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `concepts clang`
--
ALTER TABLE `concepts clang`
  ADD PRIMARY KEY (`concept id`);

--
-- Indexes for table `concepts cpp`
--
ALTER TABLE `concepts cpp`
  ADD PRIMARY KEY (`concept id`);

--
-- Indexes for table `concepts dotnet`
--
ALTER TABLE `concepts dotnet`
  ADD PRIMARY KEY (`concept id`);

--
-- Indexes for table `concepts java`
--
ALTER TABLE `concepts java`
  ADD PRIMARY KEY (`concept id`);

--
-- Indexes for table `concepts php`
--
ALTER TABLE `concepts php`
  ADD PRIMARY KEY (`concept id`);

--
-- Indexes for table `student_info`
--
ALTER TABLE `student_info`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `concepts clang`
--
ALTER TABLE `concepts clang`
  MODIFY `concept id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `concepts cpp`
--
ALTER TABLE `concepts cpp`
  MODIFY `concept id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
--
-- AUTO_INCREMENT for table `concepts dotnet`
--
ALTER TABLE `concepts dotnet`
  MODIFY `concept id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
--
-- AUTO_INCREMENT for table `concepts java`
--
ALTER TABLE `concepts java`
  MODIFY `concept id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
--
-- AUTO_INCREMENT for table `concepts php`
--
ALTER TABLE `concepts php`
  MODIFY `concept id` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
