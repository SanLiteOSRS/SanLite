import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ps")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 1691366293
	)
	@Export("ItemComposition_fileCount")
	public static int ItemComposition_fileCount;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1773810981
	)
	static int field4685;
	@ObfuscatedName("h")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "Llg;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = -1039345667
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("d")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Llg;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0; // L: 13
		this.loaded = false; // L: 14
		this.archive = var1; // L: 17
	} // L: 18

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-2123990611"
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

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "77"
	)
	@Export("load")
	int load() {
		if (this.percentLoaded < 33) { // L: 34
			if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2949.name, this.cacheName)) { // L: 35
				return this.percentLoaded; // L: 36
			}

			this.percentLoaded = 33; // L: 38
		}

		if (this.percentLoaded == 33) { // L: 40
			if (this.archive.isValidFileName(WorldMapCacheName.field2948.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2948.name, this.cacheName)) { // L: 41 42
				return this.percentLoaded; // L: 43
			}

			this.percentLoaded = 66; // L: 46
		}

		if (this.percentLoaded == 66) { // L: 48
			if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2952.name)) { // L: 49
				return this.percentLoaded; // L: 50
			}

			this.percentLoaded = 100; // L: 52
			this.loaded = true; // L: 53
		}

		return this.percentLoaded; // L: 55
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "280221262"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded; // L: 59
	}

	@ObfuscatedName("x")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "4"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded; // L: 63
	}
}
