set projectLocation=D:\NaveenFiles\SeleniumProjects\ExploreSelenium\
cd %projectLocation%
set classPath=%projectLocation%\out\production\ExploreSelenium;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\src\testngWithPackage.xml
pause