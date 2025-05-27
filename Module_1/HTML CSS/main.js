// 1. JavaScript Basics & Setup
console.log("Welcome to the Community Portal");

window.onload = () => {
  alert("Page is fully loaded");
};

// 2. Syntax, Data Types, and Operators
const eventName = "Music Fest";
const eventDate = "2025-06-15";
let availableSeats = 50;

console.log(
  `Event: ${eventName} | Date: ${eventDate} | Seats: ${availableSeats}`
);

function register() {
  if (availableSeats > 0) {
    availableSeats--;
    console.log(`Registered successfully! Seats left: ${availableSeats}`);
  } else {
    console.log("Sorry, event is full!");
  }
}

// 3. Conditionals, Loops, and Error Handling
const events = [
  { name: "Art Expo", date: "2025-06-01", seats: 0 },
  { name: "Tech Talk", date: "2025-07-10", seats: 15 },
  { name: "Music Fest", date: "2025-06-15", seats: 50 },
];

const today = new Date("2025-05-27");

events.forEach((event) => {
  const eventDate = new Date(event.date);
  if (eventDate > today && event.seats > 0) {
    console.log(
      `Upcoming Event: ${event.name} | Date: ${event.date} | Seats: ${event.seats}`
    );
  }
});

function safeRegister(event) {
  try {
    if (event.seats > 0) {
      event.seats--;
      console.log(
        `Registered for ${event.name}. Remaining seats: ${event.seats}`
      );
    } else {
      throw new Error("Event full");
    }
  } catch (error) {
    console.error(`Registration failed: ${error.message}`);
  }
}

// 4. Functions, Scope, Closures, Higher-Order Functions
function addEvent(eventsArr, newEvent) {
  eventsArr.push(newEvent);
}

function registerUser(eventName) {
  const event = events.find((e) => e.name === eventName);
  if (event) safeRegister(event);
}

function filterEventsByCategory(eventsArr, category) {
  return eventsArr.filter((e) => e.category === category);
}

function createCategoryTracker(category) {
  let count = 0;
  return function () {
    count++;
    console.log(`${count} registrations in ${category} category`);
  };
}

// 5. Objects and Prototypes
function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}

Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};

const eventObj = new Event("Coding Bootcamp", "2025-08-01", 25);
console.log(Object.entries(eventObj));

// 6. Arrays and Methods
const allEvents = [
  { name: "Baking Workshop", category: "Workshop" },
  { name: "Guitar Jam", category: "Music" },
];

allEvents.push({ name: "Piano Night", category: "Music" });
const musicEvents = allEvents.filter((e) => e.category === "Music");
const formattedEvents = allEvents.map((e) => `Event: ${e.name}`);
console.log(formattedEvents);

// 7. DOM Manipulation
const container = document.querySelector("#eventsContainer");
allEvents.forEach((event) => {
  const card = document.createElement("div");
  card.textContent = `${event.name} - ${event.category}`;
  container.appendChild(card);
});

// 8. Event Handling
document.querySelectorAll(".registerBtn").forEach((button) => {
  button.onclick = () => alert("Registered!");
});

document.querySelector("#categoryFilter").onchange = (e) => {
  console.log(`Filtering by: ${e.target.value}`);
};

document.querySelector("#searchBox").onkeydown = (e) => {
  if (e.key === "Enter") {
    console.log(`Searching for: ${e.target.value}`);
  }
};

// 9. Async JS, Promises, Async/Await
function fetchEvents() {
  return fetch("https://mockapi.io/events")
    .then((res) => res.json())
    .then((data) => console.log("Events fetched:", data))
    .catch((err) => console.error("Failed to fetch events", err));
}

async function loadEventsAsync() {
  const spinner = document.querySelector("#spinner");
  spinner.style.display = "block";
  try {
    const res = await fetch("https://mockapi.io/events");
    const data = await res.json();
    console.log("Events (async):", data);
  } catch (err) {
    console.error("Async fetch failed", err);
  } finally {
    spinner.style.display = "none";
  }
}

// 10. Modern JavaScript Features
function showEventDetails({ name, date, seats = 0 }) {
  console.log(`${name} is on ${date}. Seats: ${seats}`);
}

const [firstEvent, ...restEvents] = events;
const clonedEvents = [...events];

// 11. Working with Forms
document
  .querySelector("#registerForm")
  .addEventListener("submit", function (e) {
    e.preventDefault();
    const { name, email, selectedEvent } = e.target.elements;
    if (!name.value || !email.value || !selectedEvent.value) {
      alert("Please fill all fields correctly");
    } else {
      console.log(`Registered ${name.value} for ${selectedEvent.value}`);
    }
  });

// 12. AJAX & Fetch API
function postRegistration(data) {
  fetch("https://mockapi.io/register", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(data),
  })
    .then((res) => res.json())
    .then((result) => {
      console.log("Registration successful", result);
    })
    .catch((err) => console.error("Error registering", err));
}

// Simulate delay
setTimeout(() => console.log("Response received after delay"), 2000);

// 14. jQuery and JS Frameworks
$("#registerBtn").click(function () {
  alert("jQuery Register clicked");
});

$(".eventCard").fadeIn();
setTimeout(() => {
  $(".eventCard").fadeOut();
}, 3000);

// Note: Consider using React or Vue for dynamic UI handling and better state management.
