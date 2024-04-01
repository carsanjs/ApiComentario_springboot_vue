<template>
    <div>
        <ul class="list-group">
          <li class="list-group-item" v-show="date">{{ date }}:{{ time }} </li>  
        </ul>
    </div>  
</template>

<script>
    export default {
        name: "DateComponent",
        data: () => ({
          date: '',
          time: '',
        }),
        methods: {
          printDate: function () {
            return new Date().toLocaleDateString();
          },
          printTime: function () {
            return new Date().toLocaleTimeString();
          },
        },
        mounted: function () {
          this.date = this.printDate();
          this.time = this.printTime();
        },
    };
</script>

<style lang="less">
ul.list-group{
    list-style-type: none;

}

</style>