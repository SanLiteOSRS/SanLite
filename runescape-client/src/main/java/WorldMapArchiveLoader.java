import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ou")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("c")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "Lls;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 2084954561
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("k")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Lls;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0; // L: 13
		this.loaded = false; // L: 14
		this.archive = var1; // L: 17
	} // L: 18

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "927865025"
	)
	@Export("reset")
	void reset(String var1) {
		if (var1 != null && !var1.isEmpty()) { // L: 21
			if (var1 != this.cacheName) { // L: 24
				this.cacheName = var1; // L: 27
				this.percentLoaded = 0; // L: 28
				this.loaded = false; // L: 29
				this.load(); // L: 30
			}
		}
	} // L: 22 25 31

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1276824364"
	)
	@Export("load")
	int load() {
		if (this.percentLoaded < 33) { // L: 34
			if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2869.name, this.cacheName)) { // L: 35
				return this.percentLoaded; // L: 36
			}

			this.percentLoaded = 33; // L: 38
		}

		if (this.percentLoaded == 33) { // L: 40
			if (this.archive.isValidFileName(WorldMapCacheName.field2874.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2874.name, this.cacheName)) { // L: 41 42
				return this.percentLoaded; // L: 43
			}

			this.percentLoaded = 66; // L: 46
		}

		if (this.percentLoaded == 66) { // L: 48
			if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2868.name)) { // L: 49
				return this.percentLoaded; // L: 50
			}

			this.percentLoaded = 100; // L: 52
			this.loaded = true; // L: 53
		}

		return this.percentLoaded; // L: 55
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "2146368821"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded; // L: 59
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1781787395"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded; // L: 63
	}
}
