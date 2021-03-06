import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("mj")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("y")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = -925994251
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("e")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		signature = "(Lig;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0;
		this.loaded = false;
		this.archive = var1;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "1607253331",
		signature = "(Ljava/lang/String;I)V"
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

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-460265936",
		signature = "(I)I"
	)
	@Export("load")
	int load() {
		if (this.percentLoaded < 33) {
			if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field323.name, this.cacheName)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 33;
		}

		if (this.percentLoaded == 33) {
			if (this.archive.isValidFileName(WorldMapCacheName.field324.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field324.name, this.cacheName)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 66;
		}

		if (this.percentLoaded == 66) {
			if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field326.name)) {
				return this.percentLoaded;
			}

			this.percentLoaded = 100;
			this.loaded = true;
		}

		return this.percentLoaded;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "868597570",
		signature = "(I)Z"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		garbageValue = "-754192338",
		signature = "(I)I"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded;
	}
}
