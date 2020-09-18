<template>
  <div>
    <v-container fluid class="py-0 my-7 px-0 mx-0">
      <v-row fluid justify="center" class="py-0 my-0 px-0 mx-5">
        <v-col xl="6" lg="8" cols="12" class="pa-0 ma-0">
          <v-row
            justify="center"
            fluid
            align="center"
            class="py-0 my-0 px-0 mx-0"
          >
            <v-col cols="4" class="py-0 my-0 px-0 mx-0" justify="center">
              <v-btn
                color="#AD1457"
                tile
                dark
                large
                width="100%"
                class="mx-0 px-0"
                >홈 투표중</v-btn
              >
            </v-col>
            <v-col cols="4" class="py-0 my-0 px-0 mx-0" justify="center">
              <v-btn
                tile
                dark
                large
                width="100%"
                style="border:0px;"
                class="mx-0 px-0"
                >어웨이 투표중</v-btn
              >
            </v-col>
            <v-col cols="4" class="py-0 my-0 px-0 mx-0" justify="center">
              <v-btn
                tile
                dark
                large
                width="100%"
                class="mx-0 px-0"
                style="border:0px;"
                >투표완료</v-btn
              >
            </v-col>
          </v-row>
        </v-col>
      </v-row>
    </v-container>

    <v-container fluid class="py-0 my-7 px-0 mx-0">
      <v-row fluid justify="center" class="py-0 my-0 px-0 mx-5">
        <v-col xl="6" lg="8" cols="12" class="pa-0 ma-0 mb-2">
          <span>홈팀 진행중 투표</span>
        </v-col>
      </v-row>
      <v-row fluid justify="center" class="py-0 my-0 px-0 mx-5">
        <v-col xl="6" lg="8" cols="12" class="pa-0 ma-0">
          <v-row fluid justify="center" class="ma-0 pa-0">
            <v-col cols="3" justtify="center" class="ma-0, pa-0">등록일</v-col>
            <v-col cols="3" justtify="center" class="ma-0, pa-0"
              >투표마감일</v-col
            >
            <v-col cols="3" justtify="center" class="ma-0, pa-0">경기일</v-col>
            <v-col cols="3" justtify="center" class="ma-0, pa-0"
              >경기장소</v-col
            >
          </v-row>
          <v-row
            fluid
            justify="center"
            class="ma-0 pa-0"
            v-for="item in desserts"
            :key="item.name"
          >
            <v-col xl="12" lg="12" cols="12" class="pa-0 ma-0">
              <v-row
                fluid
                ="center" class="ma-0, pa-0">{{
                  item.name
                }}</v-col>
                <v-col cols="3" justtify="center" class="ma-0, pa-0">{{
                  item.calories
                }}</v-col>
                <v-col cols="3" justtify="center" class="ma-0, pa-0">{{
                  item.name
                }}</v-col>
                <v-col cols="3" justtify="center" class="ma-0, pa-0">{{
                  item.calories
                }}</v-col>
              </v-row>
              <v-row
                fluid
                justify="center"
                class="ma-0 pa-0 content"
                v-bind:style="istoggled ? 'width:100%' : 'display:none'"
                >ddddddddddddddddddd</v-row
              >
            </v-col>
          </v-row>
          <v-simple-table style="border-radius:0px">
            <template v-slot:default>
              <thead>
                <tr>
                  <th class="text-left">Name</th>
                  <th class="text-left">Calories</th>
                  <th class="text-left">Name</th>
                  <th class="text-left">Calories</th>
                </tr>
              </thead>
              <tbody>
                <tr
                  v-for="(item, i) in desserts"
                  :key="item.name"
                  :id="'a' + i"
                  @click="add('a' + i)"
                >
                  <td>
                    {{ item.name }}
                  </td>
                  <td>{{ item.calories }}</td>
                  <td>{{ item.name }}</td>
                  <td>{{ item.calories }}</td>
                </tr>
              </tbody>
            </template>
          </v-simple-table>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>
<script>
export default {
  data() {
    return {
      istoggled: false,
      desserts: [
        {
          name: "Frozen Yogurt",
          calories: 159
        },
        {
          name: "Ice cream sandwich",
          calories: 237
        },
        {
          name: "Eclair",
          calories: 262
        },
        {
          name: "Cupcake",
          calories: 305
        },
        {
          name: "Gingerbread",
          calories: 356
        },
        {
          name: "Jelly bean",
          calories: 375
        },
        {
          name: "Lollipop",
          calories: 392
        },
        {
          name: "Honeycomb",
          calories: 408
        },
        {
          name: "Donut",
          calories: 452
        },
        {
          name: "KitKat",
          calories: 518
        }
      ]
    };
  },
  methods: {
    isToggle: function() {
      alert("바보");
      console.log(this.istoggled);
      this.istoggled = !this.istoggled;
    }
  }
};
</script>
