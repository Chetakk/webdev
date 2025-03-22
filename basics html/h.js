// Create a new Date object for the current date and time
var d = new Date();
var lbr = "\n";  // using newline for console output

// Display the current date and time
console.log("Current Date and Time: " + d + lbr);

// Create a Date object using a specific date string
var d1 = new Date("Mar 21 2016");
console.log("Specific Date (Mar 21 2016): " + d1 + lbr);

// Output various date and time components
console.log("Day of the Month: " + d.getDate() + lbr);
console.log("Day of the Week (0 for Sunday, 6 for Saturday): " + d.getDay() + lbr);
console.log("Full Year: " + d.getFullYear() + lbr);
console.log("Hours: " + d.getHours() + lbr);
console.log("Milliseconds: " + d.getMilliseconds() + lbr);
console.log("Minutes: " + d.getMinutes() + lbr);
console.log("Seconds: " + d.getSeconds() + lbr);




