<%@ page contentType="text/html; charset=gb2312" %>

<div class="top">
<div class="topbg">
 <table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td width="46%" style="padding-left:20px;">&nbsp;</td>
      <td width="27%" height="84">&nbsp;</td>
      <td width="16%" align="right"><img src="../../../res/default/images/tubiao1.gif"  style="padding-bottom:1px; padding-right:6px;" /><a href="../../../res/default/yindao.html">������ҳ</a></td>
      <td width="11%" align="center"><img src="images/tubiao1.gif"   style="padding-bottom:1px; padding-right:6px;" /><a href="#">��ϵ����</a></td>
      </tr>
  </table>
</div>
</div>
<script language="javascript">
	function qiehuan(num){
		for(var id = 1;id<=9;id++)
		{
			if(id==num)
			{
				document.getElementById("qh_con"+id).style.display="block";
				document.getElementById("mynav"+id).className="nav_on";
			}
			else
			{
				document.getElementById("qh_con"+id).style.display="none";
				document.getElementById("mynav"+id).className="";
			}
		}
	}
</script>
<div id="menu_out">
  <div id="menu_in">
    <div id="menu">
      <UL id="nav"><LI style="width:70px;"></LI>
     <LI><A class="nav_on" id="mynav1" onmouseover="javascript:qiehuan(1)" href="channle_1.jsp"><SPAN>��ҳ</SPAN></A></LI>
	 <LI class="menu_line"></LI>
    <LI><A class="nav_on" id="mynav2" onmouseover="javascript:qiehuan(2)" href="channle_2.jsp"><SPAN>��Ѷ</SPAN></A></LI>
	 <LI class="menu_line"></LI>
    <LI><A class="nav_on" id="mynav3" onmouseover="javascript:qiehuan(3)" href="channle_3.jsp"><SPAN>С˵</SPAN></A></LI>
	 <LI class="menu_line"></LI>
    <LI><A class="nav_on" id="mynav4" onmouseover="javascript:qiehuan(4)" href="channle_4.jsp"><SPAN>����</SPAN></A></LI>
	 <LI class="menu_line"></LI>
    <LI><A class="nav_on" id="mynav5" onmouseover="javascript:qiehuan(5)" href="channle_5.jsp"><SPAN>���</SPAN></A></LI>
	 <LI class="menu_line"></LI>

</UL>
<div id="menu_con">

        <div id="qh_con1" style="DISPLAY: none">
          <UL><LI style="width:50px;"></LI>
            <LI><a href="part_1.jsp"><span>��վ����</span></A></LI>
            <LI class="menu_line2"></LI>
            <LI><a href="part_2.jsp"><span>��������</span></A></LI>
            <LI class="menu_line2"></LI>
          </UL>
        </div>
        <div id="qh_con2" style="DISPLAY: none">
          <UL><LI style="width:50px;"></LI>
            <LI><a href="part_3.jsp"><span>����</span></A></LI>
            <LI class="menu_line2"></LI>
            <LI><a href="part_4.jsp"><span>�Ƽ�</span></A></LI>
            <LI class="menu_line2"></LI>
          </UL>
        </div>
        <div id="qh_con3" style="DISPLAY: none">
          <UL><LI style="width:50px;"></LI>
            <LI><a href="part_5.jsp"><span>����</span></A></LI>
            <LI class="menu_line2"></LI>
            <LI><a href="part_6.jsp"><span>����</span></A></LI>
            <LI class="menu_line2"></LI>
          </UL>
        </div>
        <div id="qh_con4" style="DISPLAY: none">
          <UL><LI style="width:50px;"></LI>
            <LI><a href="part_13.jsp"><span>��������</span></A></LI>
            <LI class="menu_line2"></LI>
            <LI><a href="part_14.jsp"><span>��������</span></A></LI>
            <LI class="menu_line2"></LI>
          </UL>
        </div>
        <div id="qh_con5" style="DISPLAY: none">
          <UL><LI style="width:50px;"></LI>
            <LI><a href="part_12.jsp"><span>�������</span></A></LI>
            <LI class="menu_line2"></LI>
            <LI><a href="part_11.jsp"><span>�ֻ����</span></A></LI>
            <LI class="menu_line2"></LI>
          </UL>
        </div>
        <div id="qh_con6" style="DISPLAY: none">
          <UL><LI style="width:50px;"></LI>
            <LI><a href="part_8.jsp"><span>�羰ͼƬ</span></A></LI>
            <LI class="menu_line2"></LI>
            <LI><a href="part_7.jsp"><span>��ŮͼƬ</span></A></LI>
            <LI class="menu_line2"></LI>
          </UL>
        </div>
        <div id="qh_con7" style="DISPLAY: none">
          <UL><LI style="width:50px;"></LI>
            <LI><a href="part_9.jsp"><span>���԰�</span></A></LI>
            <LI class="menu_line2"></LI>
          </UL>
        </div>
        <div id="qh_con8" style="DISPLAY: none">
          <UL><LI style="width:50px;"></LI>
            <LI><a href="part_10.jsp"><span>��ϵ����</span></A></LI>
            <LI class="menu_line2"></LI>
          </UL>
        </div>
        <div id="qh_con10" style="DISPLAY: none">
          <UL><LI style="width:50px;"></LI>
            <LI><a href="part_12.jsp"><span>�������</span></A></LI>
            <LI class="menu_line2"></LI>
          </UL>
        </div>
       
 
      
      </div>
    </div>
  </div>
</div>
