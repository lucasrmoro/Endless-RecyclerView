package com.example.endlessrecyclerview.data

import com.example.endlessrecyclerview.data.model.Animal

object DataSource {

    val animalsListMocked = listOf(
        page1,
        page2,
        page3,
        page4,
        page5,
        page6,
        page7,
        page8,
        page9,
        page10,
        page11,
        page12,
        page13,
        page14
    )

    private val page1
        get() = listOf(
            "Aardvark",
            "Albatross",
            "Alligator",
            "Alpaca",
            "Ant",
            "Anteater",
            "Antelope",
            "Ape",
            "Armadillo",
            "Donkey",
            "Baboon",
            "Badger",
            "Barracuda",
            "Bat",
            "Bear",
            "Beaver"
        ).map { Animal(it) }

    private val page2
        get() = listOf(
            "Bee",
            "Bison",
            "Boar",
            "Buffalo",
            "Butterfly",
            "Camel",
            "Capybara",
            "Caribou",
            "Cassowary",
            "Cat",
            "Caterpillar",
            "Cattle",
            "Chamois",
            "Cheetah",
            "Chicken",
            "Chimpanzee",
        ).map { Animal(it) }

    private val page3
        get() = listOf(
            "Chinchilla",
            "Chough",
            "Clam",
            "Cobra",
            "Cockroach",
            "Cod",
            "Cormorant",
            "Coyote",
            "Crab",
            "Crane",
            "Crocodile",
            "Crow",
            "Curlew",
            "Deer",
            "Dinosaur",
            "Dog"
        ).map { Animal(it) }

    private val page4
        get() = listOf(
            "Dogfish",
            "Dolphin",
            "Dotterel",
            "Dove",
            "Dragonfly",
            "Duck",
            "Dugong",
            "Dunlin",
            "Eagle",
            "Echidna",
            "Eel",
            "Eland",
            "Elephant",
            "Elk",
            "Emu",
            "Falcon",
        ).map { Animal(it) }

    private val page5
        get() = listOf(
            "Ferret",
            "Finch",
            "Fish",
            "Flamingo",
            "Fly",
            "Fox",
            "Frog",
            "Gaur",
            "Gazelle",
            "Gerbil",
            "Giraffe",
            "Gnat",
            "Gnu",
            "Goat",
            "Goldfinch",
            "Goldfish",
            "Goose",
        ).map { Animal(it) }

    private val page6
        get() = listOf(
            "Gorilla",
            "Goshawk",
            "Grasshopper",
            "Grouse",
            "Guanaco",
            "Gull",
            "Hamster",
            "Hare",
            "Hawk",
            "Hedgehog",
            "Heron",
            "Herring",
            "Hippopotamus",
            "Hornet",
            "Horse",
            "Human",
            "Hummingbird",
        ).map { Animal(it) }

    private val page7
        get() = listOf(
            "Hyena",
            "Ibex",
            "Ibis",
            "Jackal",
            "Jaguar",
            "Jay",
            "Jellyfish",
            "Kangaroo",
            "Kingfisher",
            "Koala",
            "Kookabura",
            "Kouprey",
            "Kudu",
            "Lapwing",
            "Lark",
            "Lemur",
            "Leopard",
        ).map { Animal(it) }

    private val page8
        get() = listOf(
            "Lion",
            "Llama",
            "Lobster",
            "Locust",
            "Loris",
            "Louse",
            "Lyrebird",
            "Magpie",
            "Mallard",
            "Manatee",
            "Mandrill",
            "Mantis",
            "Marten",
            "Meerkat",
            "Mink",
            "Mole",
        ).map { Animal(it) }

    val page9
        get() = listOf(
            "Mongoose",
            "Monkey",
            "Moose",
            "Mosquito",
            "Mouse",
            "Mule",
            "Narwhal",
            "Newt",
            "Nightingale",
            "Octopus",
            "Okapi",
            "Opossum",
            "Oryx",
            "Ostrich",
            "Otter",
            "Owl",
        ).map { Animal(it) }

    private val page10
        get() = listOf(
            "Oyster",
            "Panther",
            "Parrot",
            "Partridge",
            "Peafowl",
            "Pelican",
            "Penguin",
            "Pheasant",
            "Pig",
            "Pigeon",
            "Pony",
            "Porcupine",
            "Porpoise",
            "Quail",
            "Quelea",
            "Quetzal",
        ).map { Animal(it) }

    private val page11
        get() = listOf(
            "Rabbit",
            "Raccoon",
            "Rail",
            "Ram",
            "Rat",
            "Raven",
            "Red deer",
            "Red panda",
            "Reindeer",
            "Rhinoceros",
            "Rook",
            "Salamander",
            "Salmon",
            "Sand Dollar",
            "Sandpiper",
            "Sardine",
        ).map { Animal(it) }

    private val page12 get() =  listOf(
        "Scorpion",
        "Seahorse",
        "Seal",
        "Shark",
        "Sheep",
        "Shrew",
        "Skunk",
        "Snail",
        "Snake",
        "Sparrow",
        "Spider",
        "Spoonbill",
        "Squid",
        "Squirrel",
        "Starling",
        "Stingray",
    ).map { Animal(it) }

    private val page13
        get() = listOf(
            "Stinkbug",
            "Stork",
            "Swallow",
            "Swan",
            "Tapir",
            "Tarsier",
            "Termite",
            "Tiger",
            "Toad",
            "Trout",
            "Turkey",
            "Turtle",
            "Viper",
            "Vulture",
            "Wallaby",
            "Walrus",
        ).map { Animal(it) }

    private val page14
        get() = listOf(
            "Wasp",
            "Weasel",
            "Whale",
            "Wildcat",
            "Wolf",
            "Wolverine",
            "Wombat",
            "Woodcock",
            "Woodpecker",
            "Worm",
            "Wren",
            "Yak",
            "Zebra"
        ).map { Animal(it) }
}