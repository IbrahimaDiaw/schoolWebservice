��ࡱ�                >  ��	               K          M      ����    J   �������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������� ��  ��          �4   bjbjE�E�                   .:  '� '�       `                       ��         ��         ��                 �     L      L  �      �      �      �      �             ����    �      �      �  8     L   [  <   �      �1  B  �      �  (   �      �      �      �      �      �      1     1      1      1      1      1      1  ,   �3  �  �6  �   F1  -                   �      �                      �      �      �      �      F1      �      �      �      �              �      s1     �      �      �      �  �  �      �      �      �      1              �                                                      �      1              �      �  �   �.  �                                                                           l0              ����    �հs�        ����    �  6  l/             1     �1  0   �1      �/  �   a7      �      a7  (   l0      �                                                                                      �      l0  �                                                                           �      �      �      F1      F1                                      �                                      �      �      �      �1      �      �      �      �              ����    ����    ����            ����    ����    ����    ����    ����    ����    ����    ����    ����    ����    ����    ����    ����    ����    a7      �      �      �      �      �      �                                                              �      �      �      L  =  �  :                                                                                                                                                                                                                                                                                                                                                                                                                                            C r y p t o g r a p h i e   e t   A p p l i c a t i o n s  T P 1    C r y p t o g r a p h i e      O u t i l   O p e n s s l      N O M   :     G r o u p e   :        O b j e c t i f s   d u   T P   �!S e   f a m i l i a r i s e r   a v e c   l e s   f o n c t i o n a l i t � s   e t   l a   b i b l i o t h � q u e   o p e n S S L  �!L e   b u t   e s t   d e   s e   p r � p a r e r   �   l  u t i l i s a t i o n   d e   l a   b i b l i o t h � q u e .      N o t e z   b i e n   :  lorsque les informations qui vous sont fournies sont insuffisantes, faites une recherche dans l�aide qui vous est propos�e par Linux avec la commande� man openssl �.I � Le protocole OpenSSLLa biblioth�que OpenSSL est une implantation libre des protocoles SSL et TSL qui donneacc�s � :une biblioth�que de fonctionnalit� �crite en C permettant de r�aliser des applications client/serveur s�curis�es s�appuyant sur SSL/TSL,un ensemble d�ex�cutables en commande en ligne permettant :la forge de clef RSA, DSA (pour les signature)la cr�ation de certificat X509 (identification)le calcul d�empreinte (MD5, SHA, RIPEMD160, ...)le chiffrement et le d�chiffrement (RSA, DES, IDEA, RC2, RC4, Blowfish, ...)la r�alisation de de tests de clients et serveurs SSL/TSLla signature et le chiffrement de courriers (S/MIME).$ openssl genrsa -out <fichier_rsa.priv> <size> : g�n�re la cl� priv� RSA de taille size. les valeurs possible pour size sont : 512, 1024, etc.$ openssl rsa -in <fichier_rsa.priv> -pubout -out <fichier_rsa.pub> : stocke la partie publique dans un fichier � part (cr�ation de de la cl� publique associ�e � la clef priv�e dans le fichier fichier_rsa.pub).$ openssl rsa -in <fichier_rsa.priv> -des3 -out <fichier.pem> : chiffre la clefpriv� RSA avec l�algorithme DES3. Vous pouvez utiliser DES, 3DES, IDEA, etc.$ openssl enc <-algo> -in <claire.txt> -out <chiffre.enc> : pour le chiffrement de claire.txt avec l�algorithme sp�cifi� (openssl enc --help pour avoir la liste des possibilit�s ou bien openssl list-cipher-commands) dans un fichier chiffre.enc.$ openssl enc <-algo> -in <chiffre> -d -out <claire> : pour le d�chiffrement.$ openssl dgst <-algo> -out <sortie> <entr�e> : pour hacher un fichier. L�option <-algo> est le choix de l�algorithme de hachage (sha, sha1, dss1, md2,md4, md5, ripemd160).$ openssl rand -out <cl�.key> <nombre_bits> : pour g�n�rer un nombre al�atoire de taille nombre_bits (utiliser l�option -base 64 pour la lisibilit�).$ openssl aes-256-cbc -in <claire.txt> -out <chiffre.enc> -e -k <cl�.key>: pour chiffrer un fichier avec l�AES.$ openssl rsautl -encrypt -inkey <rsa.pub> -in <clair.txt> -out <chiffre.enc> : chiffrer clair.txt avec la RSA en utilisant la clef publique rsa.pub.$ openssl rsautl -decrypt -inkey <rsa.priv> -in <chiffre.enc> -out<fichier.txt> : pour d�chiffrer le fichier chiffre.enc.$ openssl rsautl -sign -inkey <ras.priv> -in <fichier.txt> -out <fic.sig> :pour g�n�rer une signature.$ openssl rsautl -verify -pubin -inkey <rsa.pub> -in fic fic.sig : pour v�rifier une signatureII � T�ches � faireDans ce premier TP, on va utiliser les fonctionalit�s openSSL avec de mettre en �uvre les m�canismes de s�curit� (Confidentialit�, Int�grit�, Authenticit�). Dans un premier temps, vous allez faire les choses suivantes en utilisant les fonctionnalit�s OpenSSL et pas encore la biblioth�que :Forgez vos clefs RSA 512.Chiffrer le petit fichier en RSA.Envoyez votre cl� publique � un voisin. Celui-ci vous enverra la sienne. G�n�rer un petit fichier texte et envoyez-le � votre voisin chiffr� avec sa clef publique. Lui vous enverra un fichier chiffr� avec sa clef. Renvoyez-lui le message qu�il vous a envoy� mais en clair.G�n�rez une clef AES 256. Chiffrez le fichier pdf du TP avec puis d�chiffrez-le.Toujours en binome : A g�n�re une clef AES 256 qu�il chiffre avec la clef publique RSA de B et il lui envoye le chiffr�. A partir de l�, B r�cup�re la clef (en clair), et il chiffre un gros fichier avec l�AES et la clef AES. Il envoie le gros fichier ch                    @  B  H  J  L  �  �  �  �  �  �  �  �  �  �  $	  b	  f	  �	  �	  �	  �	  ���������������ɿ����xeUB   $h&'� 5�CJ OJ PJ QJ \�^J aJ  h&'� CJ OJ PJ QJ ^J aJ  $h�uZ h�uZ CJ OJ PJ QJ ^J aJ  $h�uZ h�uZ CJ OJ PJ QJ ^J aJ  hjZ� CJ OJ PJ QJ ^J aJ  $hjZ� hjZ� CJ OJ PJ QJ ^J aJ  !h&'� CJ OJ PJ QJ ^J aJ o(h&'� OJ QJ ^J  h&'� 5�>* 	h&'� 5�h�1� h�1� ^J  h�t� CJ aJ  h�1� CJ aJ  h&'� CJ aJ  
h&'� ^J  h&'�        B  L  �  �  �  �  �  �  �  �  �  �  �  �  d	  �	  �	  �            �            �            �            �            �            �            �            �            �            �            �            �            �            �            �            �            �            �                                  �t d��  �  1$ 7$ ^�t    �t d��  �  1$ 7$ ^�t gd�uZ  	  d8�  �  1$ 7$  & $$d%d&d'dN�     O�     P�     Q�     a$   �	  �	  �
  �
  �
  �
  �
  �
    %  �  �    I  z  �    �            �            �            �            �            �            �            �            �            �            �            �            �            �            �            �                
&F d�  �  1$ 7$ gd�1�   
& F d�  �  1$ 7$ gd�1�    �t d�  �  1$ 7$ ^�t gd�1�    d$�  � �  1$ 7$   gdX}�  	  d8�  �  1$ 7$    �t d��  �  1$ 7$ ^�t    �t d�  �  1$ 7$ ^�t    d��  � �  1$ 7$  �	  �	  �	  �	  �	  �	  �	  �	  �	   
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
  ��î���֞��zh��Vh���h�Dh�h  "h&'� @���CJ OJ PJ QJ ^J aJ  "h&'� @� CJ OJ PJ QJ ^J aJ  "h&'� @� CJ OJ PJ QJ ^J aJ  "h&'� @���CJ OJ PJ QJ ^J aJ  "h&'� @� CJ OJ PJ QJ ^J aJ  h&'� CJ OJ PJ QJ ^J aJ  (h&'� 5�@� CJ OJ PJ QJ \�^J aJ  $h&'� 5�CJ OJ PJ QJ \�^J aJ  (h&'� 5�@� CJ OJ PJ QJ \�^J aJ  (h&'� 5�@���CJ OJ PJ QJ \�^J aJ 
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
  ��̺𨖄�����r�̺�����`��������   "h&'� @���CJ OJ PJ QJ ^J aJ  "h&'� @� CJ OJ PJ QJ ^J aJ  "h&'� @� CJ OJ PJ QJ ^J aJ  "h&'� @���CJ OJ PJ QJ ^J aJ  "h&'� @� CJ OJ PJ QJ ^J aJ  "h&'� @� CJ OJ PJ QJ ^J aJ  "h&'� @���CJ OJ PJ QJ ^J aJ  "h&'� @� CJ OJ PJ QJ ^J aJ  h&'� CJ OJ PJ QJ ^J aJ %D
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
  ���޺�̨����ބ�r��`޺�ި���N��  "h&'� @�5 CJ OJ PJ QJ ^J aJ  "h&'� @�3 CJ OJ PJ QJ ^J aJ  "h&'� @�4 CJ OJ PJ QJ ^J aJ  "h&'� @���CJ OJ PJ QJ ^J aJ  "h&'� @���CJ OJ PJ QJ ^J aJ  "h&'� @�7 CJ OJ PJ QJ ^J aJ  "h&'� @���CJ OJ PJ QJ ^J aJ  "h&'� @� CJ OJ PJ QJ ^J aJ  h&'� CJ OJ PJ QJ ^J aJ  "h&'� @� CJ OJ PJ QJ ^J aJ m
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
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  ��̺��̨̺�����̨��r̺����޺�`�`�`�        "h&'� @���CJ OJ PJ QJ ^J aJ  "h&'� @�3 CJ OJ PJ QJ ^J aJ  "h&'� @�5 CJ OJ PJ QJ ^J aJ  "h&'� @�4 CJ OJ PJ QJ ^J aJ  "h&'� @���CJ OJ PJ QJ ^J aJ  "h&'� @���CJ OJ PJ QJ ^J aJ  "h&'� @� CJ OJ PJ QJ ^J aJ  "h&'� @�6 CJ OJ PJ QJ ^J aJ  h&'� CJ OJ PJ QJ ^J aJ $�
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  ��ʺ��~�rbXRLHA7                          h&'� OJ QJ ^J  hX}� h&'�  h�1�  
h&'� @��� 
hP� @��� hX}� OJ QJ ^J  h&'� B*OJ PJ QJ ^J ph    h&'� OJ PJ QJ ^J  (h&'� 6�@� CJ OJ PJ QJ ]�^J aJ  (h�uZ 6�@���CJ OJ PJ QJ ]�^J aJ  "h&'� @� CJ OJ PJ QJ ^J aJ  h&'� CJ OJ PJ QJ ^J aJ  "h&'� @� CJ OJ PJ QJ ^J aJ  "h&'� @���CJ OJ PJ QJ ^J aJ  "h&'� @���CJ OJ PJ QJ ^J aJ �
  {  |  I  �  6  8  9  �  �  �  �      r  s  �  �  �  �  �  �  �  �      y  z    	  m  n  �  �    	  
    1  <      ��������������������������������������|�p               h&'� @���OJ QJ ^J  h� h}� @���OJ QJ ^J  h}� @���OJ QJ ^J  h,b� h� @���OJ QJ ^J  h� @���OJ QJ ^J  h� h� @���OJ QJ ^J  h� OJ QJ ^J  h&'� OJ QJ ^J  h�1� h�1� 5�@���OJ QJ ^J h�1� @���OJ QJ ^J  h�1� h�1� @���OJ QJ ^J )  7  8  9  �  �  8  -  {  (  �  .  �  >  �            �            �            �            �            �            �            �            �            �            �            �            �            �            �            �            �            �            �            �                                �t d�  �" �  1$ 7$ ^�t gd�   
&F dh �x �  1$ 7$ gd,b�    �t d�  �" �  1$ 7$ ^�t gdX}�  	  d8�  �  1$ 7$   
&F d�  �  1$ 7$ gd�1�          	  
          +  ,  Y  �  �  �      ?  @  A  Z  ^  �  �  �  �  ?  @  �  �  �  �  Q  R  �   4   4  &4  '4  �������ʾ���������y�l�l�l�l�l�l�l�ljl�f     h&'�  Uh,b� h,b� OJ QJ ^J  h,b� h&'� @���OJ QJ ^J  h,b� hP� @���OJ QJ ^J  hP� @���OJ QJ ^J  h,b� @���OJ QJ ^J  h,b� h,b� @���OJ QJ ^J  h&'� @���OJ QJ ^J  
h,b� @�  
h&'� @�  h,b�  
h&'� @�  hP�  
h&'� @��� h,b� OJ QJ ^J  h,b� @���OJ QJ ^J '    �  @  A  [  \  ]  ^  _  �  �  �  �  �            �            �            �            �            �            �            �            s            �            s            �            �                    � d�  � �  1$ 7$ ]� gd,b�  0  d$�  � �  $d%d&d'd1$ 7$ N�     O�     P�     Q�     gd,b�   
& F � d�  � �  1$ 7$ ]� gd,b�    � �Qd�  � �  1$ 7$ ]� `�Qgd� �    d$�  � �  1$ 7$ gd,b�    d$�  � �  1$ 7$  �  �  �  �  �  �  �  �  �  �  �  �  �  �  �  �  �  �  �  �  �            �            �            �            �            �            �            �            �            �            �            �            �            �            �            �            �            �            �                 
& F � d�  � �  1$ 7$ ]� gd,b�    � d�  � �  1$ 7$ ]� gd,b�  0  d$�  � �  $d%d&d'd1$ 7$ N�     O�     P�     Q�     gd,b�  �  �   4  !4  "4  #4  $4  %4  &4  '4  )4  *4  ,4  -4  /4  �            �            �            �            �            �            �            �            �            }            {            }            {            }                      d�  �   	  d8�  �  1$ 7$  0  d$�  � �  $d%d&d'd1$ 7$ N�     O�     P�     Q�     gd,b�    � �Qd�  � �  1$ 7$ ]� `�Qgd� �   
& F � d�  � �  1$ 7$ ]� gd,b�    � d�  � �  1$ 7$ ]� gd,b�  iffr� � A qui doit le d�chiffr�TP1 � Cryptographie � Outil OpensslPage  PAGE 2 sur  NUMPAGES \* ARABIC 3                                                                                                                                                                                                                                                                                                                                                                                        '4  (4  *4  +4  -4  .4  04  14  34  44  64  74  84  94  V4  ]4  ^4  _4  c4  d4  e4  f4  g4  l4  m4  n4  v4  �4  �4  �4  �4  �4  �4  �4  ����������������ø�Ψ���ø�Ψ����                                                                                                                                                                       hP� 5�CJ \�aJ mH nH uhuKr 5�CJ \�aJ  h&'� 5�CJ \�aJ  j    h&'� 5�CJ U\�aJ h&'�  
h�1� PJ  
h�t� PJ  
h&'� PJ  huKr  j    huKr U !/4  04  24  34  W4  X4  �4  �4  �4  �4  �            �            �            �            �            �            �            �            �                                                                                                                                                                                                                                                                                                                  	  d8�  �  1$ 7$   $a$   � �   d�  �      	, 1�+��. ��A!��"��#��$��%�  ������                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  "   |              �   �   �   �   �   �   �   �   �   6  6  6  6  6  6  6  6  6  v  v  v  v  v  v  v  v  v  6  6  6  6  6  6  8  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  �   6  6     6  6  6  6  6  6  6  6  �   6  6  6  6  6  6  6  6  6  6  6  6  h  H  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  6  p  6  6  6  6  6  6  6  6  6  6  2     �  �  �  �      &  6  F  V  f  v  �  �  �  �  �  �      2  (  �  �  &  6  F  V  f  v  �  �  �  �  �  �      &  6  F  V  f  v  �  �  �  �  �  �      &  6  F  V  f  v  �  �  �  �  �  �      &  6  F  V  f  v  �  �  �  �  �  �      &  6  F  V  f  v  �  �  �  �  �  �      &  6  F  V  f  v  �  �  8  X  �      V  ~  �  �  �  �  �  �  �  �          0  @  �  �          0  @  �  �          0  @  �  �          0  @  �  �          0  @  �  �          0  @  �  �          0  @  �  �          0  @  �  �          0  @  �  �          0  @  �  �          0  @  �  �          0  @  �  �          0  @  �  �          0  @     _HmHnHsHtH    F  `�� F          N o r m a l      d �� *$  _HmHsHtHF @  F          T i t r e   1     @& 
& F 
& F �� �< $                  : A ��� :         P o l i c e   p a r   d � f a u t     Z i ��� Z       0 T a b l e a u   N o r m a l     :V �  4�   4� 
l a�      2 k ��� 2        0 A u c u n e   l i s t e         < �/��� <           P o l i c e   p a r   d � f a u t 1     . �/��.           E n - t � t e   C a r     8 �/��8           P i e d   d e   p a g e   C a r     . �/��!.           T i t r e   1   C a r     6 !��16          E m p h a s e   i n t e n s e     6 U ��A6           L i e n   h y p e r t e x t e     4 � b4           T i t r e 1     �� �x $   F B  bF           C o r p s   d e   t e x t e     d  �  ��   * / ar*           L i s t e      ^J 6 "  �6          L � g e n d e     �x �x $   . � �.           I n d e x     $  ^J 6   �6           E n - t � t e     � �p#   @  @ �@           P i e d   d e   p a g e     � �p#   N �`���N          S a n s   i n t e r l i g n e     *$  _HmHsHtHD � �D           C o n t e n u   d e   t a b l e a u     $   L ���L           T i t r e   d e   t a b l e a u     $$a$  5\PK     ! ��pO�        [Content_Types].xml���j�0E����ж�r�(��΢�]��yl��#!MB��;.��n�̽�̨\�A�1&�ҫ��
���QW���Kv�Ub�OX�#&������1`R��T�9<�l�#��$��>��r��	`�С�-�;c=1g<y�|�v��<�HD���o��4�08,�f�����C� �S�.[�rQ��w!�,	ﲚ�T�F�0,C���HF��e�3Ѿm�����(��g���O �����4���_   �� PK     ! �֧��   6     _rels/.rels���j�0���}Q��%v/��C/�} �(h"���O�
������=������ ����C?�h�v=��Ʌ��%[xp��{۵_�Pѣ<�1�H�0���O�R�Bd���JE�4b$��q_����6L��R�7`�������0̞O��,�En7�Li�b��/�S���e��е����  �� PK     ! ky��   �      theme/theme/themeManager.xml�M
� @�}�w��7c�(Eb�ˮ�� C�AǠҟ����7��՛KY,��e�.���|,���H�,l����xɴ��I�sQ}#Ր���� ֵ+�!�,�^�$j=�GW���)�E�+&
8�  �� PK     ! mMY��  �     theme/theme/theme1.xml�Y݊�F�/����I�Y��lo��&!v��rVK�i�f�}�B!-�)�����7軤��C��H�g�q��-��5,��;g�9��;#��{/����������4d3�F=��t\�(�!�R�sW���?��.:1N��)?@=7bqP�����8���,K���YT�e��&�ڨ�Z���uR���i������|NB����(L�
.B�M�o\��FK����%��x@3�ў�����C�Cϭ�?�zx��
#*��jvc�W�����3�N�I=��Z�ҿP���G�Q��� (a�9ݧ?��~��@�����=l��濹ù�ˏ�W�ܿ������W����=��<�@9���o��C�m�(�$=�A��V3X�����o�w}o�n�7(�����s��}���,@)$u�j��(�2%�q�IC�-P�8��q�	���SW*"� #�Z�&|gH�qx���蹟�WW�<_:GL�$,fUN��(�t��?}��_9����7��n㹎�4����C�j7ax���?~{��������?C�:|J̝���y�X�e�4���4FD��G)��X�� ~:��
Qd� :�Y2c-_�'q����A����e�(<�sia�.��>y��qO:������h� }%6�A���)J�p��#cg[V��#�'$�gs�<'� kH��Ԩ���}�@^V6��o#6'Ϝ��U񹉄�Q�)�F��R���r�����Fr��B7�2aʜ�sn�y��z��? �������	rf�y�ӑCv�(Yذ��:�3~%���L��'̼C�w��Ǿt?#�H��j��U��)��2���3�~'+:GXI����	I/�-i��=i?!i3ˊnK�����\S����O��D|n[����ǯ�C�Lc�Yv������p��y��w?߾\o�[n]�ͺں'{w�sB�D�(>�j�Ρ/��0(��c+.��1\�;&0pQ����1��$F���]�$��;�a㯆��%�.�6�X�u�p��Gb3^��qx�9���<����H=,�	H���&3I4-$��A$�hA��P+�]��t�N��Vf6Nl�z��	�3�x&�z�]������` ��ul2ݕ\�.O�./�+d� ���IBEF�0�.�S�^��us�ݤԠ'C�����hw>�⦹�mm���4u.zn��CɄh�s�����j��/��>E���7Q�E���8��\"p�P��\��24U��� -�.���F�n&��8zڵ��+(|��_����Ғ-!ݓxv��e�A������px�Sϣ9#�B��M�m5�Bv�7����qD1*:�.�9\IyIG}+c�}+��BR4��H6X=�F7-�F�ao׽�HFN�M�4TEvM��3���V,o��5V����>��m����nk�Pv	x?K׽BCШm&3�Iƻ2,5�5{�z��P�J��T��v���GX���u~�ۮZ����*���C?�`�/@<��xIW������h��$�l�-�R�\9ˌ��W5��?��:���5�Z�������7�#�^����8�����^D�Uq���w`����;!K�L��Tqu So0�ɋ3�,�C@t^��n�;hU������J7h*�V������_�ι{�f�F�J��U��;�J�k4�^��y���6V��G��u�   �� PK     ! ѐ��     '   theme/theme/_rels/themeManager.xml.rels��M
�0���wooӺ�&݈Э���56?$Q���,.�a��i����c2�1h�:�q��m��@RN��;d�`��o7�g�K(M&$R(.1�r'J��ЊT���8��V�"��AȻ�H�u}��|�$�b{� �P����8�g/]�QAsم(����#��L�[����   �� PK-      ! ��pO�                      [Content_Types].xmlPK-      ! �֧��   6               -  _rels/.relsPK-      ! ky��   �                  theme/theme/themeManager.xmlPK-      ! mMY��  �               �  theme/theme/theme1.xmlPK-      ! ѐ��     '             �	  theme/theme/_rels/themeManager.xml.relsPK      ]  �
    <?xml version="1.0" encoding="UTF-8" standalone="yes"?>
<a:clrMap xmlns:a="http://schemas.openxmlformats.org/drawingml/2006/main" bg1="lt1" tx1="dk1" bg2="lt2" tx2="dk2" accent1="accent1" accent2="accent2" accent3="accent3" accent4="accent4" accent5="accent5" accent6="accent6" hlink="hlink" folHlink="folHlink"/>    }  '  :    ����             	            1   1   _   _   _   b      �	  
  D
  m
  �
  �
    '4  �4                                �	      �  �  /4  �4                       6   =   ?   E   Z   \   b   !����    <   C   �   �   �   �   �  �  �  �  �  �       �  �  ;  B  C  I  P  `  k  q  �  �  �  �  �  �  �  �  �  �  �  �  �  �  �  �  �  �  :  A  B  E  H  L  e  p  �  �  �  �  �  �  �       +  /  6  7  :  =  A  }  �  �  �  �  �  �  �  �     *  1  =  D  G  R  �  �  �  �  �  �  �  	  0	  7	  8	  >	  @	  G	  I	  N	  o	  z	  �	  �	  �	  �	  �	  �	  �	  �	  �	  �	  �	   
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
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  �
  C  Q  R  Y      �  �    
      ^  d        !  "  $  %  '  (  D  K  {  ~                                                                                                                                                                           �  �       %  (  �  �  �  �      I  K  z  |  �  �      X  `  �  �  �  �  �  �      	  	  �	  �	  ]
  e
  �  ?            !  "  $  %  '  (  {  ~   3  3  3  3  3  3  3  3  3  3  3  3  3  3  3  3  3  3    3                   ���������  8zd	$,���������� Fp�\����������� �]I5�J��������� ��9l���������� �"�L������������ �pofFS�h���������    �                     ���P�� �^��`�P�     �                     �@���� @^�@`���     �                     ���0�� �^��`�0�     �                     �`���� `^�``���     �                     ����� �^��`��     �                     ������ �^��`���     �                     ����� ^�`���     �                     ���`�� �^��`�`�     �                     �0���� 0^�0`���               h        �����^��`���OJ QJ o( �h    �H   ��             h        �����^��`���OJ QJ ^J o( �h    �H   o                          �$	���^�$	`���OJ PJ  QJ ^J o(  "    �         h      
  �@���^�@`����h    �H    .    �         h      
  ����^�`����h    �H    .    �         h      
  ���L�^��`�L��h    �H    .     �         h      
  �����^��`����h    �H    .    �         h      
  �����^��`����h    �H    .    �         h      
  �P�L�^�P`�L��h    �H    .              h        �����^��`���OJ QJ o( �h    �H   ��             h        �����^��`���OJ QJ o( �h    �H   ��                         �$	���^�$	`���OJ PJ  QJ ^J o(  "    �         h      
  �@���^�@`����h    �H    .    �         h      
  ����^�`����h    �H    .    �         h      
  ���L�^��`�L��h    �H    .     �         h      
  �����^��`����h    �H    .    �         h      
  �����^��`����h    �H    .    �         h      
  �P�L�^�P`�L��h    �H    .              h      
  �����^��`����h    �H     .                          �����^��`���OJ PJ  QJ ^J o(  "    �         h      
  �p�L�^�p`�L��h    �H    .     �         h      
  �@���^�@`����h    �H    .    �         h      
  ����^�`����h    �H    .    �         h      
  ���L�^��`�L��h    �H    .     �         h      
  �����^��`����h    �H    .    �         h      
  �����^��`����h    �H    .    �         h      
  �P�L�^�P`�L��h    �H    .              h      
  �����^��`����h    �H     .    �         h      
  �����^��`����h    �H    .    �         h      
  �p�L�^�p`�L��h    �H    .     �         h      
  �@���^�@`����h    �H    .    �         h      
  ����^�`����h    �H    .    �         h      
  ���L�^��`�L��h    �H    .     �         h      
  �����^��`����h    �H    .    �         h      
  �����^��`����h    �H    .    �         h      
  �P�L�^�P`�L��h    �H    .              h        �����^��`���OJ QJ o( �h    �H   ��                         �����^��`���OJ PJ  QJ ^J o(  "                          �$	���^�$	`���OJ PJ  QJ ^J o(  "    �         h      
  �@���^�@`����h    �H    .    �         h      
  ����^�`����h    �H    .    �         h      
  ���L�^��`�L��h    �H    .     �         h      
  �����^��`����h    �H    .    �         h      
  �����^��`����h    �H    .    �         h      
  �P�L�^�P`�L��h    �H    .              h        �D���^�D`���OJ QJ 