<template>
  <div style="display: flex;line-height: 60px;" >
    <div>
      <i class="el-icon-s-fold" ></i>
    </div>
    <div style="flex: 1;text-align: center;font-size: 25px">
      <span>欢迎来到管理系统</span>
    </div>
    <el-dropdown trigger="click">
      <span style="margin-left: 5px">庞丁豪 <i class="el-icon-arrow-down" style="margin-left: 5px"></i></span>
      <el-dropdown-menu slot="dropdown">
        <el-dropdown-item @click.native="toUser">个人中心</el-dropdown-item>
        <el-dropdown-item @click.native="logOut">退出登录</el-dropdown-item>
      </el-dropdown-menu>
    </el-dropdown>

  </div>
</template>

<script>
export default {
  name: "Header",
  methods:{
    toUser(){
      console.log("ToUser");
    },
    logOut(){
      console.log("logOut");
    }
  }
}
</script>

<style scoped>

</style>