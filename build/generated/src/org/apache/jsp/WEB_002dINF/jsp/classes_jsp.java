╨╧рб▒с                >  ■ 	               K          M      ■       J                                                                                                                                                                                                                                                                                                                                                                                                                                                   ье┴ Бш  Ё┐          И4   bjbjE╜E╜                   .:  '╫ '╫       `                                                                ╖     L      L  ├      ├      ├      ├      ├                     ╫      ╫      ╫  8     L   [  <   ╫      ╣1  B  Ч      Ч  (   ┐      ┐      ┐      ┐      ┐      ┐      1     1      1      1      1      1      1  ,   √3  ╢  ▒6  ░   F1  -                   ├      ┐                      ┐      ┐      ┐      ┐      F1      ╫      ├      ├      ┐              ┐      s1     ╫      ╫      ╫      ┐  т  ├      ┐      ├      ┐      1              ╫                                                      ┐      1              ╫      ╫  ╞   ▄.  Р                                                                           l0                      └╒░s╒                б  6  l/             1     Й1  0   ╣1      А/  ь   a7      ╫      a7  (   l0      ╫                                                                                      ├      l0  Ш                                                                           ┐      ┐      ┐      F1      F1                                      ╫                                      ┐      ┐      ┐      ╣1      ┐      ┐      ┐      ┐                                                                                                                                                              a7      ┐      ┐      ┐      ┐      ┐      ┐                                                              ┐      ┐      ┐      L  =  Й  :                                                                                                                                                                                                                                                                                                                                                                                                                                            C r y p t o g r a p h i e   e t   A p p l i c a t i o n s  T P 1    C r y p t o g r a p h i e      O u t i l   O p e n s s l      N O M   :     G r o u p e   :        O b j e c t i f s   d u   T P   ╥!S e   f a m i l i a r i s e r   a v e c   l e s   f o n c t i o n a l i t щ s   e t   l a   b i b l i o t h ш q u e   o p e n S S L  ╥!L e   b u t   e s t   d e   s e   p r щ p a r e r   р   l  u t i l i s a t i o n   d e   l a   b i b l i o t h ш q u e .      N o t e z   b i e n   :  lorsque les informations qui vous sont fournies sont insuffisantes, faites une recherche dans lТaide qui vous est proposщe par Linux avec la commandeл man openssl ╗.I Ц Le protocole OpenSSLLa bibliothшque OpenSSL est une implantation libre des protocoles SSL et TSL qui donneaccщs р :une bibliothшque de fonctionnalitщ щcrite en C permettant de rщaliser des applications client/serveur sщcurisщes sТappuyant sur SSL/TSL,un ensemble dТexщcutables en commande en ligne permettant :la forge de clef RSA, DSA (pour les signature)la crщation de certificat X509 (identification)le calcul dТempreinte (MD5, SHA, RIPEMD160, ...)le chiffrement et le dщchiffrement (RSA, DES, IDEA, RC2, RC4, Blowfish, ...)la rщalisation de de tests de clients et serveurs SSL/TSLla signature et le chiffrement de courriers (S/MIME).$ openssl genrsa -out <fichier_rsa.priv> <size> : gщnщre la clщ privщ RSA de taille size. les valeurs possible pour size sont : 512, 1024, etc.$ openssl rsa -in <fichier_rsa.priv> -pubout -out <fichier_rsa.pub> : stocke la partie publique dans un fichier р part (crщation de de la clщ publique associщe р la clef privщe dans le fichier fichier_rsa.pub).$ openssl rsa -in <fichier_rsa.priv> -des3 -out <fichier.pem> : chiffre la clefprivщ RSA avec lТalgorithme DES3. Vous pouvez utiliser DES, 3DES, IDEA, etc.$ openssl enc <-algo> -in <claire.txt> -out <chiffre.enc> : pour le chiffrement de claire.txt avec lТalgorithme spщcifiщ (openssl enc --help pour avoir la liste des possibilitщs ou bien openssl list-cipher-commands) dans un fichier chiffre.enc.$ openssl enc <-algo> -in <chiffre> -d -out <claire> : pour le dщchiffrement.$ openssl dgst <-algo> -out <sortie> <entrщe> : pour hacher un fichier. LТoption <-algo> est le choix de lТalgorithme de hachage (sha, sha1, dss1, md2,md4, md5, ripemd160).$ openssl rand -out <clщ.key> <nombre_bits> : pour gщnщrer un nombre alщatoire de taille nombre_bits (utiliser lТoption -base 64 pour la lisibilitщ).$ openssl aes-256-cbc -in <claire.txt> -out <chiffre.enc> -e -k <clщ.key>: pour chiffrer un fichier avec lТAES.$ openssl rsautl -encrypt -inkey <rsa.pub> -in <clair.txt> -out <chiffre.enc> : chiffrer clair.txt avec la RSA en utilisant la clef publique rsa.pub.$ openssl rsautl -decrypt -inkey <rsa.priv> -in <chiffre.enc> -out<fichier.txt> : pour dщchiffrer le fichier chiffre.enc.$ openssl rsautl -sign -inkey <ras.priv> -in <fichier.txt> -out <fic.sig> :pour gщnщrer une signature.$ openssl rsautl -verify -pubin -inkey <rsa.pub> -in fic fic.sig : pour vщrifier une signatureII Ц Tтches р faireDans ce premier TP, on va utiliser les fonctionalitщs openSSL avec de mettre en Ьuvre les mщcanismes de sщcuritщ (Confidentialitщ, Intщgritщ, Authenticitщ). Dans un premier temps, vous allez faire les choses suivantes en utilisant les fonctionnalitщs OpenSSL et pas encore la bibliothшque :Forgez vos clefs RSA 512.Chiffrer le petit fichier en RSA.Envoyez votre clщ publique р un voisin. Celui-ci vous enverra la sienne. Gщnщrer un petit fichier texte et envoyez-le р votre voisin chiffrщ avec sa clef publique. Lui vous enverra un fichier chiffrщ avec sa clef. Renvoyez-lui le message quТil vous a envoyщ mais en clair.Gщnщrez une clef AES 256. Chiffrez le fichier pdf du TP avec puis dщchiffrez-le.Toujours en binome : A gщnщre une clef AES 256 quТil chiffre avec la clef publique RSA de B et il lui envoye le chiffrщ. A partir de lр, B rщcupшre la clef (en clair), et il chiffre un gros fichier avec lТAES et la clef AES. Il envoie le gros fichier ch                    @  B  H  J  L  Ж  К  О  Ъ  Ю  ░  ║  ╪  ▄  ▐  $	  b	  f	  т	  ф	  ш	  ь	  №Ўюцю▐цю╒Ў№╨№╨№╔┐оЫЛоxeUB   $h&'э 5БCJ OJ PJ QJ \Б^J aJ  h&'э CJ OJ PJ QJ ^J aJ  $h╩uZ h╩uZ CJ OJ PJ QJ ^J aJ  $h╩uZ h╩uZ CJ OJ PJ QJ ^J aJ  hjZЧ CJ OJ PJ QJ ^J aJ  $hjZЧ hjZЧ CJ OJ PJ QJ ^J aJ  !h&'э CJ OJ PJ QJ ^J aJ o(h&'э OJ QJ ^J  h&'э 5Б>* 	h&'э 5Бhэ1н hэ1н ^J  h╫tЙ CJ aJ  hэ1н CJ aJ  h&'э CJ aJ  
h&'э ^J  h&'э        B  L  И  М  О  Ь  Ю  ▓  ┤  ╢  ╕  ║  ┌  ▄  d	  ф	  ц	  ¤            ¤            ╓            ╓            ╓            ¤            ¤            ¤            ¤            ¤            ¤            ¤            ¤            ¤            ¤            ╠            ╗            ╗            н                                  Дt d╩■  д  1$ 7$ ^Дt    Дt d╚■  д  1$ 7$ ^Дt gd╩uZ  	  d8   д  1$ 7$  & $$d%d&d'dN╞     O╞     P╞     Q╞     a$   ц	  ш	  Ч
  и
  й
  к
  ├
  ─
    %  о  ъ    I  z  ╟    є            х            ╫            ═            ═            ╚            ╝            л            л            Ы            Ы            Л            Л            Л            Л            Л                
&F d   д  1$ 7$ gdэ1н   
& F d   д  1$ 7$ gdэ1н    Дt d   д  1$ 7$ ^Дt gdэ1н    d$   д д  1$ 7$   gdX}п  	  d8   д  1$ 7$    Дt dЇ■  д  1$ 7$ ^Дt    Дt dЁ  д  1$ 7$ ^Дt    dш■  д д  1$ 7$  ь	  ю	  Ё	  Є	  Ї	  °	  ·	  №	  ■	   
  
  
  
  
  
  	
  

  
  
  
  
  
  
  
  
  
  
  ы╓├о├╓├╓ЮМЮzhЮМVhЮМЮhЮDhЮh  "h&'э @И  CJ OJ PJ QJ ^J aJ  "h&'э @И CJ OJ PJ QJ ^J aJ  "h&'э @И CJ OJ PJ QJ ^J aJ  "h&'э @И■ CJ OJ PJ QJ ^J aJ  "h&'э @И CJ OJ PJ QJ ^J aJ  h&'э CJ OJ PJ QJ ^J aJ  (h&'э 5Б@И CJ OJ PJ QJ \Б^J aJ  $h&'э 5БCJ OJ PJ QJ \Б^J aJ  (h&'э 5Б@И CJ OJ PJ QJ \Б^J aJ  (h&'э 5Б@И  CJ OJ PJ QJ \Б^J aJ 
  
  
  
  
  
  
  
   
  !
  "
  #
  $
  &
  '
  (
  )
  *
  +
  0
  1
  2
  4
  5
  6
  7
  8
  9
  :
  ;
  <
  >
  ?
  @
  A
  B
  C
  D
  Ё▐╠║ЁиЦД║Ё▐Ё║ЁrД╠║Ё▐Ё║Ё▐`║Ё╠ЁДЁЦ║Ё║ЦЁ   "h&'э @И¤ CJ OJ PJ QJ ^J aJ  "h&'э @И CJ OJ PJ QJ ^J aJ  "h&'э @И CJ OJ PJ QJ ^J aJ  "h&'э @И■ CJ OJ PJ QJ ^J aJ  "h&'э @И CJ OJ PJ QJ ^J aJ  "h&'э @И CJ OJ PJ QJ ^J aJ  "h&'э @И  CJ OJ PJ QJ ^J aJ  "h&'э @И CJ OJ PJ QJ ^J aJ  h&'э CJ OJ PJ QJ ^J aJ %D
  E
  F
  G
  I
  J
  M
  O
  P
  Q
  R
  S
  U
  W
  X
  Y
  Z
  ]
  ^
  _
  `
  a
  b
  e
  f
  g
  h
  i
  j
  k
  m
  ю▐╠▐║▐╠иЦ╠▐╠▐Д▐r╠▐`▐║╠▐и║╠▐NД╠  "h&'э @И5 CJ OJ PJ QJ ^J aJ  "h&'э @И3 CJ OJ PJ QJ ^J aJ  "h&'э @И4 CJ OJ PJ QJ ^J aJ  "h&'э @И■ CJ OJ PJ QJ ^J aJ  "h&'э @И¤ CJ OJ PJ QJ ^J aJ  "h&'э @И7 CJ OJ PJ QJ ^J aJ  "h&'э @И  CJ OJ PJ QJ ^J aJ  "h&'э @И CJ OJ PJ QJ ^J aJ  h&'э CJ OJ PJ QJ ^J aJ  "h&'э @И CJ OJ PJ QJ ^J aJ m
  n
  o
  p
  q
  r
  s
  t
  u
  x
  y
  z
  {
  |
  ~
  
  А
  Б
  В
  Д
  Е
  Ж
  З
  И
  Й
  К
  Л
  Н
  О
  П
  Р
  С
  Т
  У
  Ф
  Х
  Ш
  Ё▐╠║Ё▐╠и╠║╠ЁЦ╠ЁД╠и╠Ёr╠║╠Ё▐Ё▐║╠`╠`╠`Ё        "h&'э @И  CJ OJ PJ QJ ^J aJ  "h&'э @И3 CJ OJ PJ QJ ^J aJ  "h&'э @И5 CJ OJ PJ QJ ^J aJ  "h&'э @И4 CJ OJ PJ QJ ^J aJ  "h&'э @И¤ CJ OJ PJ QJ ^J aJ  "h&'э @И■ CJ OJ PJ QJ ^J aJ  "h&'э @И CJ OJ PJ QJ ^J aJ  "h&'э @И6 CJ OJ PJ QJ ^J aJ  h&'э CJ OJ PJ QJ ^J aJ $Ш
  Щ
  Ъ
  Ы
  Ь
  Э
  д
  е
  з
  и
  й
  к
  л
  м
  ┬
  ├
  ─
  ю▄╩║иУ~▄rbXRLHA7                          h&'э OJ QJ ^J  hX}п h&'э  hэ1н  
h&'э @И   
hPФ @И   hX}п OJ QJ ^J  h&'э B*OJ PJ QJ ^J ph    h&'э OJ PJ QJ ^J  (h&'э 6Б@И CJ OJ PJ QJ ]Б^J aJ  (h╩uZ 6Б@И■ CJ OJ PJ QJ ]Б^J aJ  "h&'э @И CJ OJ PJ QJ ^J aJ  h&'э CJ OJ PJ QJ ^J aJ  "h&'э @И CJ OJ PJ QJ ^J aJ  "h&'э @И  CJ OJ PJ QJ ^J aJ  "h&'э @Иў CJ OJ PJ QJ ^J aJ ─
  {  |  I  ╟  6  8  9  Е  Ж  ╚  ╔      r  s  Ы  Ь  З  И  ▄  ▌  ╦  ╠      y  z    	  m  n  З  М    	  
    1  <      ёхё╒ё╦┴▓ж▓ж▓ж▓ж▓Ч▓ж▓ж▓ж▓ж▓Л▓Л▓Л▓Л▓Л▓Л▓|▓p               h&'э @И■ OJ QJ ^J  h╥ h}є @И■ OJ QJ ^J  h}є @И■ OJ QJ ^J  h,bЇ h╥ @И■ OJ QJ ^J  h╥ @И■ OJ QJ ^J  h╥ h╥ @И■ OJ QJ ^J  h╥ OJ QJ ^J  h&'э OJ QJ ^J  hэ1н hэ1н 5Б@И  OJ QJ ^J hэ1н @И  OJ QJ ^J  hэ1н hэ1н @И  OJ QJ ^J )  7  8  9  ╔  Ь  8  -  {  (  ╛  .  ─  >  е            я            х            ╥            └            └            └            └            └            └            └            └            └            └            └            └            н            н            н            л                                Дt dЁ  д" д  1$ 7$ ^Дt gd╥   
&F dh дx д  1$ 7$ gd,bЇ    Дt dЁ  д" д  1$ 7$ ^Дt gdX}п  	  d8   д  1$ 7$   
&F d   д  1$ 7$ gdэ1н          	  
          +  ,  Y  ╖  ╣  ║      ?  @  A  Z  ^  А  З  с  т  ?  @  Ш  Я  Ё  ў  Q  R  ї   4   4  &4  '4  Їъфр┌╓╨╩╛пгпЧпгпИпyъlъlъlъlъlъlъlъljlъf     h&'э  Uh,bЇ h,bЇ OJ QJ ^J  h,bЇ h&'э @И  OJ QJ ^J  h,bЇ hPФ @И  OJ QJ ^J  hPФ @И  OJ QJ ^J  h,bЇ @И  OJ QJ ^J  h,bЇ h,bЇ @И  OJ QJ ^J  h&'э @И  OJ QJ ^J  
h,bЇ @И  
h&'э @И  h,bЇ  
h&'э @И  hPФ  
h&'э @И   h,bЇ OJ QJ ^J  h,bЇ @И■ OJ QJ ^J '    ║  @  A  [  \  ]  ^  _  Б  В  Г  Д  є            ф            ф            ═            ╖            Ж            Ж            Ж            s            ╖            s            Ж            Ж                    Д dэ  д д  1$ 7$ ]Д gd,bЇ  0  d$   д д  $d%d&d'd1$ 7$ N╞     O╞     P╞     Q╞     gd,bЇ   
& F Д dэ  д д  1$ 7$ ]Д gd,bЇ    Д ДQdэ  д д  1$ 7$ ]Д `ДQgdх С    d$   д д  1$ 7$ gd,bЇ    d$   д д  1$ 7$  Д  Е  Ж  З  И  Щ  Ъ  Ы  Ь  Э  Ю  Я  а  ё  Є  є  Ї  ї  Ў  ў  ╬            ╬            ╗            ╗            е            ╗            ╬            ╬            ╬            ╬            ╗            ╗            е            ╗            ╬            ╬            ╬            ╬            ╗                 
& F Д dэ  д д  1$ 7$ ]Д gd,bЇ    Д dэ  д д  1$ 7$ ]Д gd,bЇ  0  d$   д д  $d%d&d'd1$ 7$ N╞     O╞     P╞     Q╞     gd,bЇ  ў  °   4  !4  "4  #4  $4  %4  &4  '4  )4  *4  ,4  -4  /4  ь            ╓            ┐            О            О            О            О            ь            Д            }            {            }            {            }                      dЁ  д   	  d8   д  1$ 7$  0  d$   д д  $d%d&d'd1$ 7$ N╞     O╞     P╞     Q╞     gd,bЇ    Д ДQdэ  д д  1$ 7$ ]Д `ДQgdх С   
& F Д dэ  д д  1$ 7$ ]Д gd,bЇ    Д dэ  д д  1$ 7$ ]Д gd,bЇ  iffrщ р A qui doit le dщchiffrщTP1 Ц Cryptographie Ц Outil OpensslPage  PAGE 2 sur  NUMPAGES \* ARABIC 3                                                                                                                                                                                                                                                                                                                                                                                        '4  (4  *4  +4  -4  .4  04  14  34  44  64  74  84  94  V4  ]4  ^4  _4  c4  d4  e4  f4  g4  l4  m4  n4  v4  Б4  В4  Г4  Д4  Ж4  З4  И4  ўєўєўєўєэчэсэс▌╬├╕├╬и╬▌╬├╕├╬и╬▌є▌                                                                                                                                                                       hPФ 5БCJ \БaJ mH nH uhuKr 5БCJ \БaJ  h&'э 5БCJ \БaJ  j    h&'э 5БCJ U\БaJ h&'э  
hэ1н PJ  
h╫tЙ PJ  
h&'э PJ  huKr  j    huKr U !/4  04  24  34  W4  X4  Е4  Ж4  З4  И4  ¤            Ў            ¤            Ё            ¤            ы            ¤            ¤            с                                                                                                                                                                                                                                                                                                                  	  d8   д  1$ 7$   $a$   ╞ ╕   dЁ  д      	, 1Р+░Р. ░╞A!░К"░К#РК$РК%░  ░╨░╨Р╨                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  "   |              Ш   Ю   Ю   Ю   Ю   Ю   Ю   Ю   Ю   6  6  6  6  6  6  6  6  6  v  v  v  v  v  v  v  v  v  6  6  6  6  6  6  8  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  и   6  6     6  6  6  6  6  6  6  6  ╕   6  6  6  6  6  6  6  6  6  6  6  6  h  H  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  p  6  6  6  6  6  6  6  6  6  6  2     ╞  ╓  ц  Ў      &  6  F  V  f  v  Ж  Ц  ╞  ╓  ц  Ў      2  (  ╪  ш  &  6  F  V  f  v  Ж  Ц  ╞  ╓  ц  Ў      &  6  F  V  f  v  Ж  Ц  ╞  ╓  ц  Ў      &  6  F  V  f  v  Ж  Ц  ╞  ╓  ц  Ў      &  6  F  V  f  v  Ж  Ц  ╞  ╓  ц  Ў      &  6  F  V  f  v  Ж  Ц  ╞  ╓  ц  Ў      &  6  F  V  f  v  Ж  Ц  8  X  °      V  ~  Р  а  ░  └  ╨  А  р  Ё          0  @  р  Ё          0  @  р  Ё          0  @  р  Ё          0  @  р  Ё          0  @  р  Ё          0  @  р  Ё          0  @  р  Ё          0  @  р  Ё          0  @  р  Ё          0  @  р  Ё          0  @  р  Ё          0  @  р  Ё          0  @  р  Ё          0  @     _HmHnHsHtH    F  `ё  F          N o r m a l      d д╚ *$  _HmHsHtHF @  F          T i t r e   1     @& 
& F 
& F дЁ д< $                  : A Є б :         P o l i c e   p a r   d щ f a u t     Z i є │ Z       0 T a b l e a u   N o r m a l     :V Ў  4╓   4╓ 
l aЎ      2 k Ї ┴ 2        0 A u c u n e   l i s t e         < ■/Є ё <           P o l i c e   p a r   d щ f a u t 1     . ■/Є .           E n - t ъ t e   C a r     8 ■/Є 8           P i e d   d e   p a g e   C a r     . ■/Є !.           T i t r e   1   C a r     6 !Є 16          E m p h a s e   i n t e n s e     6 U Є A6           L i e n   h y p e r t e x t e     4 ■ b4           T i t r e 1     дЁ дx $   F B  bF           C o r p s   d e   t e x t e     d  д  дМ   * / ar*           L i s t e      ^J 6 "  В6          L щ g e n d e     дx дx $   . ■ Т.           I n d e x     $  ^J 6   в6           E n - t ъ t e     ╞ ╕p#   @  @ ▓@           P i e d   d e   p a g e     ╞ ╕p#   N ж`ё ┬N          S a n s   i n t e r l i g n e     *$  _HmHsHtHD ■ ╥D           C o n t e n u   d e   t a b l e a u     $   L ■╤тL           T i t r e   d e   t a b l e a u     $$a$  5\PK     ! ЫшpO№        [Content_Types].xmlмС╦j├0EўЕ■Г╨╢╪r║(е╪╬вП]ЛЇylЛ╪#!MBЄў;.ФЕn╥╠╜ў╠и\╞Aэ1&чй╥л╝╨
╔·╞QWщ╧═KvпUbаOXщ#&╜опп╩═1`RвжTщЮ9<УlП#д▄$й┤>О└rНЭ	`╖╨б╣-К;c=1g<yш║|┬vлчГ<ЯHDо╒уйoКк4Д08,аfкЪ│║ИC║ ▄SєЛ.[╚rQ╬цйw!▌,	я▓ЪшT∙Fс0,Cт╧єHFЛ∙eц3╤╛mЭ┼╞█▌(ы╚gу┼ьO л Й■╬4є▀╓_      PK     ! е╓зч└   6     _rels/.relsДП╧j├0ЗяЕ╜Г╤}Q╥├%v/еРC/г} с(h"█ы█O╟
╗Ддяўй=■оЛ∙сФч Ък├тC?╦hсv=┐В╔Едз%[xpЖг{█╡_╝P╤г<═1еH╢0ХИ┘O╝RоBd╤╔╥JE█4b$зСq_╫ШЮр6L╙їR╫7`оПи╔ │├0╠ЮO┴п,хEn7ФLiфbби/уS╜Риeк╘╨╡╕∙╓¤     PK     ! kyЦГ   К      theme/theme/themeManager.xml╠M
├ @с}бwР┘7c╗(Eb▓╦о╗Ў CЬA╟а╥Я█╫хуГ7╬▀╒ЫKY,ЬКe═.И╖Ё|,зи┌H┼,lс╟цщx╔┤Н▀I╚sQ}#╒РЕн╡▌ ╓╡+╒!я,▌^╣$j=ЛGWш╙ў)тEы+&
8¤     PK     ! mMYл╚  О     theme/theme/theme1.xmlьY▌К█F╛/ЇДю I■Yт╢lo┌ь&!v╥цrVKУiМf╝}ВB!-╜)ЇоЕ▐┌7ш╗д┤щCЇ╠HЦgьqЎЗ-Д╥5,Є°;g╛9чш;#═▌{/ъЬуМЦЎ▄·ЭЪыр4d3ТF=ўщt\щ╕(Э!╩R▄sWШ╗ў?¤ф.:1N░Ў)?@=7bqPнЄЖ┐├8Е▀ц,KРАпYTЭeш№&┤┌и╒Z╒С╘uRФА█i№√╧рь╤|NBьо╜П(LС
.BЪMдo\ШЦFKЕЭЭ╒%Впx@3ч╤Ю═╪┼┐оCЁC╧нй?╖zx╖К
#*Ў╪jvcїW╪││ЖЪ3ЛN╦I=╧ўZ¤╥┐P▒Л╡GнQлЇз (aе9▌з?шЖ~Б╒@∙е┼ў░=l╓╝ц┐╣├╣я╦ПБWа▄┐╖ГПИвБWаяяр=п▌<п@9╛╡Гo╫·Cпmр(ж$=█A╫№V3Xп╢Д╠╜oЕw}o▄n╬7(иЖ▓║фsЦК}╡Ца,@)$u─jБч(Д2%зqОICс-P╩8╫╡qн	 х╟SW*"ш #═ZЄ&|gHЄqxШСЕш╣ЯГWWГ<_:GL─$,fUNЛ√(НtЛў?}єў_9¤·у√7▀цУnу╣От4·ТаЇC└j7axў▌█?~{√ю√п №хН┼?Cз:|J╠ЭЗ°┬y┬XЬe°4╗Ю┼4FD╖шзG)Т│X№П ~:·с
Qd┴ :юY2c-_Д'q╢─тёAЬ└╞шАe╓(<РsiaЮ.╙╚>y╢╘qO:╖═а╘╚єh╣ }%6ЧAМЪП)JКpКЕ#cg[VўЬ#о'$╠gsс<'╬ kHжф╘ижН╤}Т@^V6ВРo#6'╧Ьг╢Uё╣ЙД╗Q∙)жFП╨Rа─цrКк№Й╪Fr▓╩B7т2a╩Ь╤sn│yФ┴z╡д? Й▒з¤ДоЩ	rfєyМ╙СCv─(Y╪░Т╞:Ў3~%КЬ╟L╪р'╠╝Cфw╚И╟╛t?#╪HўхjЁ╘Uз┤)∙╦2│фЄ3г~'+:GXIИ┐бщ	I/°-iў =i?!i3╦КnK╘эоНМ\S╬√▒▐Oў╖D|n[║Ц═╚╟п▄C┤Lc╕Yv█╫ ┬¤┐p╗ yс▐w?▀╛\o─[n]є═║┌║'{wюsBщDм(>цjє╬б/═╞0(э╘c+.Яф1\╩;&0pQЖФНУ1ёё$F╪с╫]щ$тЕыИ;╞aупЖн╛%Ю.У6╦Xыu∙pЪЛGb3^є╦qx╪9║╒▐<ДХю█H=,п	H█ыР╨&3I4-$┌ыA$їhA│РP+╗]ЛОt┐N╒аVf6Nl╖zояБ	┴3вx&єФзzЭ]Х╠█╠Ї╛` ╗Иul2▌Х\ў.Oо./╡+d┌ бХЫIBEFї0г.кSО^Е╞us▌▌д╘а'CбцГ╥┌╨hw>─тж╣╗mmайо4u.znлщC╔Дh╤sчЁрЧ╔jЗ╦/в╝>EЦ▀Ё7QЦE╞┼ё8╕Э\"pцPТЇ\╣№24Uв╕╒ -╣.╚╩╟FТn&╧ч8z┌╡щ№+(|о╓_Х∙═┴╥Т-!▌УxvсЬ╥eЎAЙ∙э║рМpx S╧г9#ЁB│▓M¤m5жBvї7КкЖЄqD1*:К.ц9\IyIG}+cа}+╓╒BR4┬╙H6X=иF7-╗F╬ao╫╜▄HFN═M╧4TEvM╗К3м█└V,o╓ф5VыГжщ>Чюm╔эо╡nkЯPv	x?K╫╜BC╨иm&3иI╞╗2,5╗5{╟zБЧP╗JУ╨T┐╡v╗╖▓GXзГ┴u~░█оZЪпўХ*╥ъшC?Ь`з/@<ЖЁxIWйДгЗ┴ЖhвЎ$╣l└-ЄR╖\9╦МЇ▄W5┐я?и╘:■ит5╜ZеуўЫХ╛я7ы#┐^пб▒И8й√∙▒╦^D╤Uq°в╞w`Тї╗╢;!KкLЭмTqu So0∙╔Л3Х,оC@t^╡уn│;hU║═■╕тЭJ7h*├V╨ОЗБ▀щО_╗╬╣{¤fр╡FЭJлпUУЇ;▌J█k4·^╗▀y¤╫┼6VЮ╦Gптu°      PK     ! ╤РЯ╢     '   theme/theme/_rels/themeManager.xml.relsДПM
┬0ДўВwoo╙║С&▌И╨н╘Дф56?$Qьэо,.Зa╛Щi╗ЧЭ╔c2▐1hк:щХqЪ┴m╕ьО@RNЙ┘;d░`ВОo7эgСK(M&$R(.1Шr'JУЬ╨КT∙Ао8гПVф"гжA╚╗╨Hўu}аёЫ|┼$╜b{╒ ЦPЪ │¤8Йg/]■QAs┘Е(в╞╠р#ЫкL╩[║║─▀      PK-      ! ЫшpO№                      [Content_Types].xmlPK-      ! е╓зч└   6               -  _rels/.relsPK-      ! kyЦГ   К                  theme/theme/themeManager.xmlPK-      ! mMYл╚  О               ╙  theme/theme/theme1.xmlPK-      ! ╤РЯ╢     '             ╧	  theme/theme/_rels/themeManager.xml.relsPK      ]  ╩
    <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<a:clrMap xmlns:a="http://schemas.openxmlformats.org/drawingml/2006/main" bg1="lt1" tx1="dk1" bg2="lt2" tx2="dk2" accent1="accent1" accent2="accent2" accent3="accent3" accent4="accent4" accent5="accent5" accent6="accent6" hlink="hlink" folHlink="folHlink"/>    }  '  :                     	            1   1   _   _   _   b      ь	  
  D
  m
  Ш
  ─
    '4  И4                                ц	      Д  ў  /4  И4                       6   =   ?   E   Z   \   b   ! А А    <   C   И   Ц   к   ▒   Э  д  ╗  ┬  ╘  █       ╕  └  ;  B  C  I  P  `  k  q  ╦  ╥  ╙  ╓  ▄  ь  я  ї  Ю  е  ж  й  п  ┐  ═  ╪  ч  Ё  :  A  B  E  H  L  e  p  ▓  ╣  ║  ╜  Є  ∙  ·       +  /  6  7  :  =  A  }  Д  Е  Й  М  Р  ╬  ╥  ¤     *  1  =  D  G  R  Б  М  └  ╟  ы  Ў     	  0	  7	  8	  >	  @	  G	  I	  N	  o	  z	  ╞	  ═	  ╬	  ╘	  ╓	  ▌	  ▀	  ф	  ц	  ю	  ї	   
  1
  <
  @
  G
  H
  N
  P
  T
  V
  [
  ]
  e
  
  Ж
  з
  о
  п
  ╡
  ╖
  ╜
  ┐
  ─
  ╞
  ╦
  ▐
  х
  C  Q  R  Y      ╬  ╤    
      ^  d        !  "  $  %  '  (  D  K  {  ~                                                                                                                                                                           Щ  Ь       %  (  о  ░  ъ  ь      I  K  z  |  ╟  ╔      X  `  У  Ц  ф  ь  ╖  ┐      	  	  ц	  ю	  ]
  e
  ║  ?            !  "  $  %  '  (  {  ~   3  3  3  3  3  3  3  3  3  3  3  3  3  3  3  3  3  3    3                              8zd	$,Ї          FpН\Гы          ф]I5ВJ          РЧ9lэ          Б"ЯLў╪Є          пpofFSоh                                   Д░ДP■╞ ░^Д░`ДP■                           Д@Д└¤╞ @^Д@`Д└¤                           Д╨Д0¤╞ ╨^Д╨`Д0¤                           Д`Да№╞ `^Д``Да№                           ДЁД№╞ Ё^ДЁ`Д№                           ДАДА√╞ А^ДА`ДА√                           ДДЁ·╞ ^Д`ДЁ·                           ДаД`·╞ а^Да`Д`·                           Д0Д╨∙╞ 0^Д0`Д╨∙               h        Д╨ДШ■^Д╨`ДШ■OJ QJ o( Зh    ИH   ╖Ё             h        ДаДШ■^Да`ДШ■OJ QJ ^J o( Зh    ИH   o                          Д$	ДШ■^Д$	`ДШ■OJ PJ  QJ ^J o(  "    Р         h      
  Д@ДШ■^Д@`ДШ■Зh    ИH    .    Р         h      
  ДДШ■^Д`ДШ■Зh    ИH    .    Т         h      
  ДрДL ^Др`ДL Зh    ИH    .     Р         h      
  Д░ДШ■^Д░`ДШ■Зh    ИH    .    Р         h      
  ДАДШ■^ДА`ДШ■Зh    ИH    .    Т         h      
  ДPДL ^ДP`ДL Зh    ИH    .              h        Д╨ДШ■^Д╨`ДШ■OJ QJ o( Зh    ИH   ╖Ё             h        ДаДШ■^Да`ДШ■OJ QJ o( Зh    ИH   №Ё                         Д$	ДШ■^Д$	`ДШ■OJ PJ  QJ ^J o(  "    Р         h      
  Д@ДШ■^Д@`ДШ■Зh    ИH    .    Р         h      
  ДДШ■^Д`ДШ■Зh    ИH    .    Т         h      
  ДрДL ^Др`ДL Зh    ИH    .     Р         h      
  Д░ДШ■^Д░`ДШ■Зh    ИH    .    Р         h      
  ДАДШ■^ДА`ДШ■Зh    ИH    .    Т         h      
  ДPДL ^ДP`ДL Зh    ИH    .              h      
  Д╨ДШ■^Д╨`ДШ■Зh    ИH     .                          ДаДШ■^Да`ДШ■OJ PJ  QJ ^J o(  "    Т         h      
  ДpДL ^Дp`ДL Зh    ИH    .     Р         h      
  Д@ДШ■^Д@`ДШ■Зh    ИH    .    Р         h      
  ДДШ■^Д`ДШ■Зh    ИH    .    Т         h      
  ДрДL ^Др`ДL Зh    ИH    .     Р         h      
  Д░ДШ■^Д░`ДШ■Зh    ИH    .    Р         h      
  ДАДШ■^ДА`ДШ■Зh    ИH    .    Т         h      
  ДPДL ^ДP`ДL Зh    ИH    .              h      
  Д╨ДШ■^Д╨`ДШ■Зh    ИH     .    Р         h      
  ДаДШ■^Да`ДШ■Зh    ИH    .    Т         h      
  ДpДL ^Дp`ДL Зh    ИH    .     Р         h      
  Д@ДШ■^Д@`ДШ■Зh    ИH    .    Р         h      
  ДДШ■^Д`ДШ■Зh    ИH    .    Т         h      
  ДрДL ^Др`ДL Зh    ИH    .     Р         h      
  Д░ДШ■^Д░`ДШ■Зh    ИH    .    Р         h      
  ДАДШ■^ДА`ДШ■Зh    ИH    .    Т         h      
  ДPДL ^ДP`ДL Зh    ИH    .              h        Д╨ДШ■^Д╨`ДШ■OJ QJ o( Зh    ИH   ╖Ё                         ДаДШ■^Да`ДШ■OJ PJ  QJ ^J o(  "                          Д$	ДШ■^Д$	`ДШ■OJ PJ  QJ ^J o(  "    Р         h      
  Д@ДШ■^Д@`ДШ■Зh    ИH    .    Р         h      
  ДДШ■^Д`ДШ■Зh    ИH    .    Т         h      
  ДрДL ^Др`ДL Зh    ИH    .     Р         h      
  Д░ДШ■^Д░`ДШ■Зh    ИH    .    Р         h      
  ДАДШ■^ДА`ДШ■Зh    ИH    .    Т         h      
  ДPДL ^ДP`ДL Зh    ИH    .              h        ДDДШ■^ДD`ДШ■OJ QJ 