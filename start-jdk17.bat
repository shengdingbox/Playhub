@echo off
REM PlayHub ????
REM  - JDK 17?Java 23 ????Spring Boot 3.3 ??? 17-22?
REM  - preferIPv4Stack??? IPv6 ????Java ???? IPv6 ??????????/??
setlocal
set "JAVA_HOME=F:\PATH\JDK17.0.9"
if not exist "%JAVA_HOME%\bin\java.exe" (
  echo [ERROR] JDK17 not found: %JAVA_HOME%
  pause
  exit /b 1
)
set "PATH=%JAVA_HOME%\bin;%PATH%"
cd /d "%~dp0"
echo Starting PlayHub on http://127.0.0.1:18080 ...
"%JAVA_HOME%\bin\java.exe" -Djava.net.preferIPv4Stack=true -jar target\playhub-1.0.1.jar --app.python-command=python --app.node-command=node --app.dex2jar-command=__AUTO__
pause