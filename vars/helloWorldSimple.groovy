def call(String name, String dayOfWeek, String lastName) {
  sh "echo Hello World ${name}. It is ${dayOfWeek}. and the last name is ${lastName}"
}
