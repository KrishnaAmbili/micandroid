<%@ page contentType="text/html; charset=gb2312" %>
<%@ include file="inc.jsp"%>
<%@ include file="head.jsp"%>
<body class="bg">
<%@ include file="channel_list.jsp"%>

<div style="height:5px;"></div>
 <div class="flash">
 </div>
<div class="con">
<div class="left">
<div class="lefttitle"><h1>С˵</h1></div>
<div class="leftcon">
<table width="98%" border="0" align="center" cellpadding="0" cellspacing="0">
<%@ include file="artilelist.jsp"%>
</table>

</div>
<div class="leftbottom"></div>
</div>
<div class="middle">
<div class="middletitle">
<ul>
<li id="one1" onmouseover="setTab('one',1,2)" class="hover">����</li>
<li id="one2" onmouseover="setTab('one',2,2)">�Ƽ�</li>
</ul>
</div><div id="con_one_1">
<div class="middlecon"></div>
<div class="middlecon2">
<ul>
<li><span>[2010-08-20]</span>&middot; <a href="#">�̱�֤����ʽ��Ч</a></li>
<li><span>[2010-08-20]</span>&middot; <a href="#">�Ͳ�����ĥ�����޹�˾ȡ����ISO9001������ϵ��֤</a></li>
<li><span>[2010-08-20]</span>&middot; <a href="#">�Ͳ�����ĥ�����޹�˾������������ҵЭ��</a></li>
<li><span>[2010-08-20]</span>&middot; <a href="#">��˾���Ӫ���������ڳﱸ֮�� </a></li>
<li><span>[2010-08-20]</span>&middot; <a href="#">�Ͳ�����ĥ�����޹�˾��������ĺ������</a></li>
<li><span>[2010-08-20]</span>&middot; <a href="#">�Ͳ�����ĥ�����޹�˾�ٻ�����֤��</a></li>
<li><span>[2010-08-20]</span>&middot; <a href="#">�̱�֤����ʽ��Ч</a></li>
</ul>
</div>
<div class="middlebottom"></div>
</div>
<div id="con_one_2" style="display:none">
<div class="middlecon"></div>
<div class="middlecon2">
<ul>
<li><span>[2010-08-20]</span>&middot; <a href="#">��˾���Ӫ���������ڳﱸ֮��</a></li>
<li><span>[2010-08-20]</span>&middot; <a href="#">�Ͳ�����ĥ�����޹�˾ȡ����ISO9001������ϵ��֤</a></li>
<li><span>[2010-08-20]</span>&middot; <a href="#">�Ͳ�����ĥ�����޹�˾������������ҵЭ��</a></li>
<li><span>[2010-08-20]</span>&middot; <a href="#">��˾���Ӫ���������ڳﱸ֮�� </a></li>
<li><span>[2010-08-20]</span>&middot; <a href="#">�Ͳ�����ĥ�����޹�˾��������ĺ������</a></li>
<li><span>[2010-08-20]</span>&middot; <a href="#">�Ͳ�����ĥ�����޹�˾�ٻ�����֤��</a></li>
<li><span>[2010-08-20]</span>&middot; <a href="#">�̱�֤����ʽ��Ч</a></li>
</ul>
</div>
<div class="middlebottom"></div>
</div>
</div>
<div class="right">
<div class="righttitle"><span><a href="#">����>></a></span>����</div>
<div class="rightcon"><p>�Ͳ�����ĥ�����޹�˾�����������ҵ��ʼ����1990�꣬�����Ƚ����������������Ƶ�������֤��ϵ��</p><p>���������ظ��񡢰׸��񡢺�̼���衢��̼����ȸ���ĥ�ϼ��ͻ���ϣ�Ʒ�������������ȶ��ɿ�������20������Һ͵������ڹ���û�����ϸߵ�����������˾���ɸ��ݿͻ���Ҫ���ṩ����ר�ò�Ʒ�� 
</p>
</div>
<div class="rightbottom"></div>
</div>
</div>
<div class="con2">
<div class="clear"></div>
<div class="pro">
<div class="protitle"><span><a href="#">����>></a></span>����ͼƬ</div>
<div class="procon">
<table width="629" border="0" cellspacing="0" cellpadding="0">
<tr>
    <td><!--demo start-->
<DIV id=demo style="OVERFLOW: hidden; WIDTH: 629px">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
<tbody>
<tr>
    <td id=demo1>
    <table width="630" border="0" cellspacing="2" cellpadding="0">
<tr>
    <td align="center" style="padding-right:9px;"><img src="images/1.jpg"></td>
    <td align="center" style="padding-right:9px;"><img src="images/2.jpg"></td>
    <td align="center" style="padding-right:9px;"><img src="images/3.jpg"></td>
    <td align="center" style="padding-right:9px;"><img src="images/4.jpg"></td>
    <td align="center" style="padding-right:9px;"><img src="images/5.jpg"></td>
</tr>
</table>
    </td>
    <td id=demo2 width="0"></td>
</tr>
</tbody>
</table>
</DIV>
<!--demo end-->
<SCRIPT>
var dir=1//ÿ���ƶ����أ��󣽿�
var speed=1//ѭ�����ڣ����룩����
demo2.innerHTML=demo1.innerHTML
function Marquee(){//�����ƶ�
//alert(demo2.offsetWidth+"\n"+demo.scrollLeft)
if (dir>0 && (demo2.offsetWidth-demo.scrollLeft)<=0) demo.scrollLeft=0
if (dir<0 &&(demo.scrollLeft<=0)) demo.scrollLeft=demo2.offsetWidth
demo.scrollLeft+=dir
demo.onmouseover=function() {clearInterval(MyMar)}//��ͣ�ƶ�
demo.onmouseout=function() {MyMar=setInterval(Marquee,speed)}//�����ƶ�
}
function r_left(){if (dir=-1)dir=1}//��������
function r_right(){if (dir=1)dir=-1}//��������
var MyMar=setInterval(Marquee,speed)
</SCRIPT></td>
</tr>
</table>
</div>
<div class="prodi"></div>
</div>
<div class="tu"><table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td><img src="../../../res/default/images/tu1.gif" width="249" height="85" /></td>
  </tr>
  <tr>
    <td style="padding-top:10px;"><img src="images/tu2.gif" width="249" height="85" /></td>
  </tr>
</table>
</div>
</div>

<%@ include file="floor.jsp"%>