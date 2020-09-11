<template>
  <v-app id="inspire">
    <v-navigation-drawer v-model="drawer" app>
      <v-card height="64">
        <v-list-item height="64" link align-center>
          <v-list-item height="64" justify-center pa-0>
            <v-list-item-avatar>
              <v-img src=".\assets\image\손흥민.jpg"></v-img>
            </v-list-item-avatar>
            <v-list-item-content pa-0>
              <v-list-item-title class="title">손흥민</v-list-item-title>
              <v-list-item-subtitle>ggapdol2@gmail.com</v-list-item-subtitle>
            </v-list-item-content>
          </v-list-item>
          <v-divider></v-divider>
        </v-list-item>
      </v-card>
      <v-list dense>
        <v-list-group
          v-for="item in items"
          :key="item.title"
          :prepend-icon="item.action"
          no-action
        >
          <template v-slot:activator>
            <v-list-item-content>
              <v-list-item-title v-text="item.title"></v-list-item-title>
            </v-list-item-content>
          </template>

          <v-list-item v-for="subItem in item.items" :key="subItem.title">
            <v-list-item-content>
              <v-list-item-title v-text="subItem.title"></v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </v-list-group>
      </v-list>
    </v-navigation-drawer>
    <v-app-bar app color="purple darken-2" dark>
      <v-app-bar-nav-icon @click.stop="drawer = !drawer"></v-app-bar-nav-icon>
      <v-toolbar-title>Application</v-toolbar-title>
    </v-app-bar>

    <v-main>
      <v-container class="fill-height" fluid>
        <router-view></router-view>
      </v-container>
    </v-main>
    <v-footer color="indigo" app>
      <span class="white--text">&copy; {{ new Date().getFullYear() }}</span>
    </v-footer>
  </v-app>
</template>

<script>
export default {
  props: {
    source: String
  },
  data: () => ({
    drawer: true,
    items: [
      {
        action: "sports_soccer",
        title: "팀 선택",
        items: [
          {
            title: "FC 답십리"
          },
          {
            title: " FC 왕십리"
          },
          { title: "FC 신답" }
        ]
      },
      {
        action: "receipt_long",
        title: "관리자 메뉴",
        items: [
          { title: "투표" },
          { title: "매치" },
          { title: "용병" },
          { title: "양도" },
          { title: "일정" },
          { title: "관리" }
        ]
      },
      {
        action: "people_alt",
        title: "팀 메뉴",
        items: [
          { title: "팀홈" },
          { title: "투표" },
          { title: "일정" },
          { title: "활동" },
          { title: "알림" }
        ]
      },
      {
        action: "face",
        title: "개인 메뉴",
        items: [
          { title: "홈" },
          { title: "개인 전체일정" },
          { title: "팀 찾기" },
          { title: "팀 만들기" },
          { title: "용병" },
          { title: "전체 알림" },
          { title: "개인정보" }
        ]
      }
    ]
  })
};
</script>
