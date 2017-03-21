grammar url;
testurl: PROTOCOL (ACCOUNT AT)? HOST port path query;

PROTOCOL:[a-zA-Z]+ '://';
ACCOUNT:[a-zA-Z]+ ':' [a-zA-Z]+;
AT: '@';
TEXT:[a-zA-Z]+;
host: TEXT;
path ('/' TEXT);
