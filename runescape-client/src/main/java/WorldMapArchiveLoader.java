import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nc")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("o")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "Lko;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("e")
	@ObfuscatedGetter(
		intValue = -1962849213
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("p")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Lko;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0;
		this.loaded = false;
		this.archive = var1;
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "38129268"
	)
	@Export("reset")
	void reset(String var1) {
		if (var1 != null && !var1.isEmpty()) {
			if (var1 != this.cacheName) {
				this.cacheName = var1;
				this.percentLoaded = 0;
				this.loaded = false;
				this.load();
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1778196022"
	)
	@Export("load")
	int load() {
		if (this.percentLoaded < 33) {
			if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field2211.name, this.cacheName)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 33;
		}

		if (this.percentLoaded == 33) {
			if (this.archive.isValidFileName(WorldMapCacheName.field2215.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field2215.name, this.cacheName)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 66;
		}

		if (this.percentLoaded == 66) {
			if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field2214.name)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 100;
			this.loaded = true;
		}

		return this.percentLoaded;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "6"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "(B)I",
		garbageValue = "21"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded;
	}

	@ObfuscatedName("g")
	@ObfuscatedSignature(
		descriptor = "(Lbw;Lbw;IZB)I",
		garbageValue = "36"
	)
	@Export("compareWorlds")
	static int compareWorlds(World var0, World var1, int var2, boolean var3) {
		if (var2 == 1) {
			int var4 = var0.population;
			int var5 = var1.population;
			if (!var3) {
				if (var4 == -1) {
					var4 = 2001;
				}

				if (var5 == -1) {
					var5 = 2001;
				}
			}

			return var4 - var5;
		} else if (var2 == 2) {
			return var0.location - var1.location;
		} else if (var2 == 3) {
			if (var0.activity.equals("-")) {
				if (var1.activity.equals("-")) {
					return 0;
				} else {
					return var3 ? -1 : 1;
				}
			} else if (var1.activity.equals("-")) {
				return var3 ? 1 : -1;
			} else {
				return var0.activity.compareTo(var1.activity);
			}
		} else if (var2 == 4) {
			return var0.method1681() ? (var1.method1681() ? 0 : 1) : (var1.method1681() ? -1 : 0);
		} else if (var2 == 5) {
			return var0.method1649() ? (var1.method1649() ? 0 : 1) : (var1.method1649() ? -1 : 0);
		} else if (var2 == 6) {
			return var0.isPvp() ? (var1.isPvp() ? 0 : 1) : (var1.isPvp() ? -1 : 0);
		} else if (var2 == 7) {
			return var0.isMembersOnly() ? (var1.isMembersOnly() ? 0 : 1) : (var1.isMembersOnly() ? -1 : 0);
		} else {
			return var0.id - var1.id;
		}
	}
}
