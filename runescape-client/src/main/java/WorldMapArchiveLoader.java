import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("os")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("eo")
	@ObfuscatedSignature(
		descriptor = "Llu;"
	)
	@Export("archive4")
	static Archive archive4;
	@ObfuscatedName("c")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Llc;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 40243639
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("j")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Llc;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0; // L: 13
		this.loaded = false; // L: 14
		this.archive = var1; // L: 17
	} // L: 18

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "-823191393"
	)
	@Export("reset")
	void reset(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			if (var1 != this.cacheName) {
				this.cacheName = var1; // L: 27
				this.percentLoaded = 0; // L: 28
				this.loaded = false; // L: 29
				this.load(); // L: 30
			}
		}
	} // L: 31

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "2069050115"
	)
	@Export("load")
	int load() {
		if (this.percentLoaded < 33) { // L: 34
			if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2861.name, this.cacheName)) { // L: 35
				return this.percentLoaded; // L: 36
			}

			this.percentLoaded = 33; // L: 38
		}

		if (this.percentLoaded == 33) { // L: 40
			if (this.archive.isValidFileName(WorldMapCacheName.field2863.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2863.name, this.cacheName)) { // L: 41 42
				return this.percentLoaded; // L: 43
			}

			this.percentLoaded = 66; // L: 46
		}

		if (this.percentLoaded == 66) { // L: 48
			if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2864.name)) { // L: 49
				return this.percentLoaded; // L: 50
			}

			this.percentLoaded = 100; // L: 52
			this.loaded = true; // L: 53
		}

		return this.percentLoaded; // L: 55
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1397935060"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded; // L: 59
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-810632026"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded; // L: 63
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		descriptor = "(II)Lpq;",
		garbageValue = "-823191393"
	)
	public static class436 method7220(int var0) {
		class436 var1 = (class436)class436.DBTableType_cache.get((long)var0); // L: 19
		if (var1 != null) { // L: 20
			return var1;
		} else {
			byte[] var2 = class436.field4682.takeFile(39, var0); // L: 21
			var1 = new class436(); // L: 22
			if (var2 != null) { // L: 23
				var1.method7621(new Buffer(var2));
			}

			var1.method7626(); // L: 24
			class436.DBTableType_cache.put(var1, (long)var0); // L: 25
			return var1; // L: 26
		}
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "-525080077"
	)
	public static int method7221(int var0) {
		if (var0 > 0) { // L: 188
			return 1;
		} else {
			return var0 < 0 ? -1 : 0; // L: 189 190
		}
	}
}
