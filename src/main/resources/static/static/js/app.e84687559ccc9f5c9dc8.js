webpackJsonp([1],{NHnr:function(t,e,s){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var n=s("7+uW"),r={name:"App",data:function(){return{showMsgListUsers:!1,msg:"MoraJunto app"}},methods:{listUsers:function(){fetch("/api/users").then(function(t){return t.json()}).then(function(t){return console.log(t)}),this.showMsgListUsers=!0}}},a={render:function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",{staticClass:"container",attrs:{id:"app"}},[s("h1",[t._v(t._s(t.msg))]),t._v(" "),s("button",{staticClass:"waves-effect waves-light btn",on:{click:t.listUsers}},[t._v("list users")]),t._v(" "),t.showMsgListUsers?s("p",[t._v("open browser dev console")]):t._e(),t._v(" "),s("hr"),t._v(" "),s("router-view")],1)},staticRenderFns:[]},o=s("VU/8")(r,a,!1,null,null,null).exports,u=s("/ocq"),l={render:function(){this.$createElement;this._self._c;return this._m(0)},staticRenderFns:[function(){var t=this,e=t.$createElement,s=t._self._c||e;return s("div",[s("h3",[t._v("Essential Links")]),t._v(" "),s("ul",[s("li",[s("a",{attrs:{href:"https://vuejs.org",target:"_blank"}},[t._v("\n        Core Docs\n      ")])]),t._v(" "),s("li",[s("a",{attrs:{href:"https://forum.vuejs.org",target:"_blank"}},[t._v("\n        Forum\n      ")])]),t._v(" "),s("li",[s("a",{attrs:{href:"https://chat.vuejs.org",target:"_blank"}},[t._v("\n        Community Chat\n      ")])]),t._v(" "),s("li",[s("a",{attrs:{href:"https://twitter.com/vuejs",target:"_blank"}},[t._v("\n        Twitter\n      ")])]),t._v(" "),s("br"),t._v(" "),s("li",[s("a",{attrs:{href:"http://vuejs-templates.github.io/webpack/",target:"_blank"}},[t._v("\n        Docs for This Template\n      ")])])]),t._v(" "),s("h3",[t._v("Ecosystem")]),t._v(" "),s("ul",[s("li",[s("a",{attrs:{href:"http://router.vuejs.org/",target:"_blank"}},[t._v("\n        vue-router\n      ")])]),t._v(" "),s("li",[s("a",{attrs:{href:"http://vuex.vuejs.org/",target:"_blank"}},[t._v("\n        vuex\n      ")])]),t._v(" "),s("li",[s("a",{attrs:{href:"http://vue-loader.vuejs.org/",target:"_blank"}},[t._v("\n        vue-loader\n      ")])]),t._v(" "),s("li",[s("a",{attrs:{href:"https://github.com/vuejs/awesome-vue",target:"_blank"}},[t._v("\n        awesome-vue\n      ")])])])])}]},v=s("VU/8")({name:"Links"},l,!1,null,null,null).exports;n.a.use(u.a);var i=new u.a({routes:[{path:"/",name:"Links",component:v}]});s("U54J"),s("gkYU");new n.a({el:"#app",router:i,components:{App:o},template:"<App/>"})},gkYU:function(t,e){}},["NHnr"]);
//# sourceMappingURL=app.e84687559ccc9f5c9dc8.js.map