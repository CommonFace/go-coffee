# go-coffee
  
22.09.06 Initial Commit  
22.09.07 First  Commit -> 클론코딩-기본프로젝트 (1) ~ (5)  
22.09.08 Second Commit -> 클론코딩-기본프로젝트 (6) ~ (8)  



# ERROR  
  
22.09.11 java.lang.RuntimeException: '-1073741515' and output  
wix이 MySQL 8.0 이상에서 windows 10 이상에서 지원하지 않는 문제  

해결방법  
STEP 1: 버전변경 / v_8 -> v_5_7_lastest  
STEP 2: SQL grammar 수정  
8+ -> UUID_TO_BIN('77dea2ad-3c8c-40c6-a278-7cf1a1ac9384');  
5  -> UNHEX(REPLACE('77dea2ad-3c8c-40c6-a278-7cf1a1ac9384', '-', ''));  
