
		</div>
		<div class="formBar">
			<ul>
				<li><div class="buttonActive">
						<div class="buttonContent">
							<button type="submit">保存</button>
						</div>
					</div></li>
				<li>
					<div class="button">
						<div class="buttonContent">
							<button type="button" class="close">取消</button>
						</div>
					</div>
				</li>
			</ul>
		</div>
	</form>
</div>




<script type="text/javascript">
function docheck(){
	 var firstlist = ""; // 第一级选中项集合，以逗号相隔。
 var secondlist = ""; //第二级选中项集合集合。
//jquery循环tt下的所有选中的复选框
$("#ttinput:checked").each(function(i,a){
    //alert(a.value); //alert(a.name);
  if (a.name == "first") {
        firstlist += a.value + ",";
      }
      else if (a.name == "second") {
        secondlist += a.value + ",";
      }});
   //alert(firstlist );
   //alert(secondlist );
  $("#Chosefirst").val(firstlist .substring(0, firstlist .length - 1));
  $("#Chosesecond").val(secondlist .substring(0, secondlist .length - 1));
	
}
</script>