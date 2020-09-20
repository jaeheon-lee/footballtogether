<style>
v-expansion-panel-content__wrap {
  padding: 0px !important;
}
</style>
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
          <v-expansion-panels focusable hover color="red">
            <v-row
              class="ma-0 pa-0"
              style="background-color:#121212;font-size: 0.75rem;inline-height:100%;color:rgba(255, 255, 255, 0.9)"
            >
              <v-col cols="3" class="text-center">등록일</v-col>
              <v-col cols="3" class="text-center">마감일</v-col>
              <v-col cols="3" class="text-center">경기일시</v-col>
              <v-col cols="3" class="text-center">경기장소</v-col>
            </v-row>
            <v-expansion-panel v-for="(vote, i) in votes" :key="i">
              <v-expansion-panel-header
                hide-actions
                class="ma-0 pa-0"
                style="background-color:#121212;font-size: 0.75rem;line-height:100%;color:rgba(255, 255, 255, 0.7)"
              >
                <v-row class="ma-0 pa-0">
                  <v-col cols="3" class="text-center">{{
                    vote.reg_date
                  }}</v-col>
                  <v-col cols="3" class="text-center">
                    {{ vote.due_date }}
                  </v-col>
                  <v-col cols="3" class="text-center">
                    {{ vote.match_date }}
                  </v-col>
                  <v-col cols="3" class="text-center">
                    {{ vote.match_place }}
                  </v-col>
                </v-row>
              </v-expansion-panel-header>

              <v-expansion-panel-content
                style="background-color:#121212;font-size: 0.75rem;line-height:100%;color:rgba(255, 255, 255, 0.9)"
              >
                <v-row class="ma-0 pa-0">
                  <v-col cols="3" class="text-center">{{
                    vote.reg_date
                  }}</v-col>
                  <v-col cols="3" class="text-center">
                    {{ vote.due_date }}
                  </v-col>
                  <v-col cols="3" class="text-center">
                    {{ vote.match_date }}
                  </v-col>
                  <v-col cols="3" class="text-center">
                    {{ vote.match_place }}
                  </v-col>
                </v-row>
              </v-expansion-panel-content>
            </v-expansion-panel>
          </v-expansion-panels>
        </v-col>
      </v-row>
    </v-container>
  </div>
</template>

<script>
export default {
  components: {},
  data() {
    return {
      votes: [
        {
          reg_date: "2020-09-18-09-00",
          due_date: "2020-09-22-09-00",
          match_date: "2020-09-30-09-00",
          match_place: "서울시 성동구 서울숲 공원"
        },
        {
          reg_date: "2020-09-19-09-00",
          due_date: "2020-09-30-09-00",
          match_date: "2020-10-06-09-00",
          match_place: "서울시 성동구 서울숲 공원"
        }
      ]
    };
  }
};
</script>
