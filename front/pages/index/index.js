//index.js
//获取应用实例
const app = getApp()

Page({
  data: {
    name:'',
    price:'',
    description:'',
    contact:''
  },
  //事件处理函数
  onLoad: function () {
    var that = this;
  },
  tupload: function(e){
     console.log(this.data)
     if (this.data.name == '' ||
       this.data.price == '' ||
       this.data.description == '' ||
       this.data.contact == '')
       {
         wx.showModal({
          title: '标题',
          content: '你输入的信息不完整',
          showCancel: false, //不显示取消按钮
          confirmText: '确定'
        })
          return;
       }
       var list=new Object();
       list.name=this.data.name;
       list.price=this.data.price;
       list.description=this.data.description;
       list.contact=this.data.contact;
       list.tags=new Array();
       list.tags[0]="书";
       list.pictures=new Array();
       list.pictures[0]="11111";
       list.date=null;
       list.ID=null;
       
       wx.request({
         url: 'http://127.0.0.1:8080/add', //仅为示例，并非真实的接口地址
         data: {
            list:list
         },
         method: "POST",
         header: {
           'content-type': 'application/json' // 默认值
         },
         success: function (res) {

         }
       })
       console.log("aaaa")
  },
  
  bname: function(e){
    this.setData({
      name: e.detail.value
    })
  },
  bprice: function(e){
    this.setData({
      price: e.detail.value
    })
  },
  bdescription: function(e){
    this.setData({
      description: e.detail.value
    })
  },
  bcontact: function(e){
    this.setData({
      contact: e.detail.value
    })
  }

})
