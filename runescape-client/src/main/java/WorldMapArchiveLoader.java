import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("sg")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("ax")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "Lnq;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 645796695
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("ak")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Lnq;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0; // L: 13
		this.loaded = false; // L: 14
		this.archive = var1; // L: 17
	} // L: 18

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "7"
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

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "602609215"
	)
	@Export("load")
	int load() {
		if (this.cacheName == null) { // L: 34
			this.percentLoaded = 100; // L: 35
			this.loaded = true; // L: 36
		} else {
			if (this.percentLoaded < 33) { // L: 39
				if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field3044.name, this.cacheName)) { // L: 40
					return this.percentLoaded; // L: 41
				}

				this.percentLoaded = 33; // L: 43
			}

			if (this.percentLoaded == 33) { // L: 45
				if (this.archive.isValidFileName(WorldMapCacheName.field3045.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field3045.name, this.cacheName)) { // L: 46 47
					return this.percentLoaded; // L: 48
				}

				this.percentLoaded = 66; // L: 51
			}

			if (this.percentLoaded == 66) { // L: 53
				if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field3047.name)) { // L: 54
					return this.percentLoaded; // L: 55
				}

				this.percentLoaded = 100; // L: 57
				this.loaded = true; // L: 58
			}
		}

		return this.percentLoaded; // L: 61
	}

	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "18"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded; // L: 65
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "697183667"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded; // L: 69
	}
}
