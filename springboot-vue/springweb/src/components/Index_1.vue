<template>
  <div>
  <el-container style="height:100% ; border: 1px solid #eee">
    <el-aside width="200px" style="background-color: rgb(238, 241, 246);height:100%">
     <Menu></Menu>
    </el-aside>

    <el-container style="height: 100%;">
      <el-header style="text-align: right; font-size: 12px">
        <Header></Header>
      </el-header>

      <el-main style="height: 100%;">
        <div style="margin-bottom:5px ">
          <el-input v-model="name" placeholder="请输入名字" suffix-icon="el-icon-search" style="width: 200px "
          @keyup.enter.native="loadPost"></el-input>
          <el-select v-model="sex" filterable placeholder="请选择性别" style="margin-left: 5px">
            <el-option
                v-for="item in sexs"
                :key="item.value"
                :label="item.label"
                :value="item.value">
            </el-option>
          </el-select>
          <el-button type="primary" style="margin-left: 5px" @click="loadPost">查询</el-button>
          <el-button type="success" @click="resetParam">重置</el-button>
          <el-button type="primary" style="margin-left: 5px" @click="add">新增</el-button>
        </div>

        <el-table :data="tableData">
          <el-table-column prop="id" label="ID" width="80">
          </el-table-column>
          <el-table-column prop="no" label="账号" width="90">
          </el-table-column>
          <el-table-column prop="name" label="姓名" width="80">
          </el-table-column>
          <el-table-column prop="age" label="年龄" width="80">
          </el-table-column>
          <el-table-column prop="sex" label="性别" width="80">
            <template slot-scope="scope">
              <el-tag
                  :type="scope.row.sex === 1 ?  'primary' : 'success'"
                  disable-transitions>{{scope.row.sex=== 1 ? '男' : '女'}}</el-tag>
            </template>
          </el-table-column>
          <el-table-column prop="roleId" label="角色" width="80">
            <template slot-scope="scope">
              <el-tag
                  :type="scope.row.roleId === 0 ?  'primary' : 'success'"
                  disable-transitions>{{scope.row.roleId === 0 ?  '管理员' : '用户'}}</el-tag>
            </template>
          </el-table-column>
          <el-table-column prop="phone" label="电话" width="130">
          </el-table-column>
          <el-table-column prop="operate" label="操作">
            <template slot-scope="scope">
             <el-button type="success" @click="mod(scope.row)">编辑</el-button>
             <el-button type="danger" @click="del(scope.row.id)">删除</el-button>
            </template>
          </el-table-column>

        </el-table>
        <el-pagination
            @size-change="handleSizeChange"
            @current-change="handleCurrentChange"
            :current-page= "pageNum"
            :page-sizes="[3, 5, 10, 400]"
            :page-size="pageSize"
            layout="total, sizes, prev, pager, next, jumper"
            :total="total">
        </el-pagination>
      </el-main>
    </el-container>
  </el-container>

    <el-dialog
        title="提示"
        :visible.sync="centerDialogVisible"
        width="30%"
        center>
      <el-form ref="form" :model="form" label-width="80px">
        <el-form-item label="账号" prop="no">
          <el-col :span="35">
          <el-input v-model="form.no" ></el-input>
          </el-col>
        </el-form-item>
        <el-form-item label="名字" prop="name">
          <el-col :span="35">
            <el-input v-model="form.name" ></el-input>
          </el-col>
        </el-form-item>
        <el-form-item label="年龄" prop="age">
          <el-col :span="35">
            <el-input v-model="form.age" ></el-input>
          </el-col>
        </el-form-item>
        <el-form-item label="性别" prop="sex">
          <el-radio-group v-model="form.resource">
            <el-radio label="1">男</el-radio>
            <el-radio label="0">女</el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="电话">
          <el-col :span="35">
            <el-input v-model="form.phone" ></el-input>
          </el-col>
        </el-form-item>
      </el-form>
      <span slot="footer" class="dialog-footer">
    <el-button @click="centerDialogVisible = false">取 消</el-button>
    <el-button type="primary" @click="save">确 定</el-button>
  </span>
    </el-dialog>

  </div>
</template>

<script>
import Header from "@/components/Header.vue";
import Menu from "@/components/Menu.vue";
import res from "core-js/internals/is-forced";

export default {
  name: "Index_1",
  components: {
    Menu,
    Header
  },
  data() {
    const item = {

    };
    return {
      tableData: [],
      pageSize:3,
      pageNum:1,
      total:0,
      name:'',
      sex:'',
      sexs:[
        {
          value:'1',
          label:'男'
        },{
          value:'0',
          label: '女'
        }
      ],
      centerDialogVisible:false,
      form:{
        id:'',
        no:'',
        name:'',
        password:'',
        age:'',
        phone:'',
        sex:''
      }
    }
  },
  methods:{
    handleSizeChange(val) {
      console.log(`每页 ${val} 条`);
      this.pageSize=val;
      this.loadPost();
    },
    handleCurrentChange(val) {
      console.log(`当前页: ${val}`);
      this.pageNum=val;
      this.loadPost();

    },
    loadGet(){
      this.$axios.get(this.$httpUrl+'/pdh3113Pdh3113Book/list').then(res=>res.data).then(res=>{
        console.log(res);
      })
    },
    loadPost(){
      this.$axios.post(this.$httpUrl+'/pdh3113Pdh3113Book/listCPage',{
        pageSize:this.pageSize,
        pageNum:this.pageNum,
        param:{
          name:this.name,
          sex:this.sex
        }
      }).then(res=>res.data).then(res=>{
        console.log(res);
        if(res.code==200){

          this.tableData = res.data;
          this.total = res.total;

        }else{
          alert("获取数据失败");
        }

      })
    },
    resetParam(){
      this.name='',
      this.sex='',
      this.loadPost()
    },
    add(){
      this.centerDialogVisible = true;

      this.$nextTick(()=>{
        this.reserFrome()
      })
    },
    reserFrome(){
        this.$refs.form.resetFields();
    },
    save(){
      if(this.form.id){
        this.doMod();
      }else {
        this.dosave();
      }
    },
    dosave(){
      this.$axios.post(this.$httpUrl+'/pdh3113Pdh3113Book/save',this.form).then(res=>res.data).then(res=>{
        console.log(res);
        if(res.code==200){

          this.$message({
            message: '添加成功',
            type: 'success',
          });
          this.loadPost()
          this.centerDialogVisible = false;

        }else{
          this.$message({
            message: '操作失败',
            type: 'error'
          });
        }

      })
    },
    mod(row){

      this.centerDialogVisible = true;

      this.form.id = row.id;
      this.form.no = row.no;
      this.form.name = row.name;
      this.form.age = row.age +'';
      this.form.sex = row.sex+'';
      this.form.phone = row.phone;

    },
    doMod(){
      this.$axios.post(this.$httpUrl+'/pdh3113Pdh3113Book/update',this.form).then(res=>res.data).then(res=>{
        console.log(res);

        if(res.code==200){

          this.$message({
            message: '修改成功',
            type: 'success',
          });
          this.loadPost()
          this.centerDialogVisible = false;

        }else{
          this.$message({
            message: '操作失败',
            type: 'error'
          });
        }

      })
    },
    del(id){
      this.$axios.get(this.$httpUrl+'/pdh3113Pdh3113Book/delete?id='+id).then(res=>res.data).then(res=>{
        console.log(res);

        if(res.code==200){

          this.$message({
            message: '删除成功',
            type: 'success',
          });
          this.loadPost()

        }else{
          this.$message({
            message: '操作失败',
            type: 'error'
          });
        }

      })
    }
  },

  beforeMount() {
    //this.loadGet();
    this.loadPost();
  }

}
</script>

<style scoped>
.el-header {
  background-color: #B3C0D1;
  color: #333;
  line-height: 60px;
}
.el-main{
  padding: 5px;
}
.el-aside {
  color: #333;
}

</style>