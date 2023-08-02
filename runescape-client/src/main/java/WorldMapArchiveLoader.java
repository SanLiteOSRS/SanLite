import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("st")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = -335289281
	)
	@Export("canvasHeight")
	public static int canvasHeight;
	@ObfuscatedName("as")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("ag")
	@ObfuscatedGetter(
		intValue = -415949189
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("az")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Lnd;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0; // L: 13
		this.loaded = false; // L: 14
		this.archive = var1; // L: 17
	} // L: 18

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1672803687"
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

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(S)I",
		garbageValue = "6387"
	)
	@Export("load")
	int load() {
		if (this.cacheName == null) { // L: 34
			this.percentLoaded = 100; // L: 35
			this.loaded = true; // L: 36
		} else {
			if (this.percentLoaded < 33) { // L: 39
				if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field3046.name, this.cacheName)) { // L: 40
					return this.percentLoaded; // L: 41
				}

				this.percentLoaded = 33; // L: 43
			}

			if (this.percentLoaded == 33) { // L: 45
				if (this.archive.isValidFileName(WorldMapCacheName.field3051.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field3051.name, this.cacheName)) { // L: 46 47
					return this.percentLoaded; // L: 48
				}

				this.percentLoaded = 66; // L: 51
			}

			if (this.percentLoaded == 66) { // L: 53
				if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field3049.name)) { // L: 54
					return this.percentLoaded; // L: 55
				}

				this.percentLoaded = 100; // L: 57
				this.loaded = true; // L: 58
			}
		}

		return this.percentLoaded; // L: 61
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "114"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded; // L: 65
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "125"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded; // L: 69
	}
}
