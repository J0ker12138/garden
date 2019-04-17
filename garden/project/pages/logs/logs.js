//logs.js
const app = getApp()

Page({
  data: {
  
    userInfo: {},
    hasUserInfo: false,
    canIUse: wx.canIUse('button.open-type.getUserInfo')

  },
  //事件处理函数
  bindViewTap: function () {
    //wx.showModal({
     // title: '测试',
     // content: '测试文字',
     // success(res){
       // if(res.confirm){
       //   wx.navigateTo({
         //   url:'../talk/talk'
        //  })
       // }
      //}
    //})

    wx.chooseImage({
      count: 1,
      sizeType: ['original', 'compressed'],
      sourceType: ['album', 'camera'],
      success(res) {
        // tempFilePath可以作为img标签的src属性显示图片
        const tempFilePaths = res.tempFilePaths
      }
    })


  },
  onLoad: function () {
   
})
