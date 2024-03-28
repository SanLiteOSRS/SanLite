import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("tp")
@Implements("WorldMapArchiveLoader")
public class WorldMapArchiveLoader {
	@ObfuscatedName("an")
	@Export("cacheName")
	String cacheName;
	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	@Export("archive")
	AbstractArchive archive;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = 496381017
	)
	@Export("percentLoaded")
	int percentLoaded;
	@ObfuscatedName("aw")
	@Export("loaded")
	boolean loaded;

	@ObfuscatedSignature(
		descriptor = "(Loc;)V"
	)
	WorldMapArchiveLoader(AbstractArchive var1) {
		this.percentLoaded = 0; // L: 13
		this.loaded = false; // L: 14
		this.archive = var1; // L: 17
	} // L: 18

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)V",
		garbageValue = "1513423157"
	)
	@Export("reset")
	void reset(String var1) {
		if (var1 != null && !var1.isEmpty()) { // L: 21
			if (var1 != this.cacheName) { // L: 24
				this.cacheName = var1; // L: 27
				this.percentLoaded = 0; // L: 28
				this.loaded = false; // L: 29
				this.method8691(); // L: 30
			}
		}
	} // L: 22 25 31

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "1692673788"
	)
	int method8691() {
		if (this.cacheName == null) { // L: 34
			this.percentLoaded = 100; // L: 35
			this.loaded = true; // L: 36
		} else {
			if (this.percentLoaded < 33) { // L: 39
				if (!this.archive.tryLoadFileByNames(WorldMapCacheName.field3155.name, this.cacheName)) { // L: 40
					return this.percentLoaded; // L: 41
				}

				this.percentLoaded = 33; // L: 43
			}

			if (this.percentLoaded == 33) { // L: 45
				if (this.archive.isValidFileName(WorldMapCacheName.field3156.name, this.cacheName) && !this.archive.tryLoadFileByNames(WorldMapCacheName.field3156.name, this.cacheName)) { // L: 46 47
					return this.percentLoaded; // L: 48
				}

				this.percentLoaded = 66; // L: 51
			}

			if (this.percentLoaded == 66) { // L: 53
				if (!this.archive.tryLoadFileByNames(this.cacheName, WorldMapCacheName.field3158.name)) { // L: 54
					return this.percentLoaded; // L: 55
				}

				this.percentLoaded = 100; // L: 57
				this.loaded = true; // L: 58
			}
		}

		return this.percentLoaded; // L: 61
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(S)Z",
		garbageValue = "25974"
	)
	@Export("isLoaded")
	boolean isLoaded() {
		return this.loaded; // L: 65
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-1775964251"
	)
	@Export("getPercentLoaded")
	int getPercentLoaded() {
		return this.percentLoaded; // L: 69
	}

	@ObfuscatedName("ob")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;B)V",
		garbageValue = "42"
	)
	static void method8706(String var0) {
		ViewportMouse.field2868 = var0; // L: 12847

		try {
			String var1 = UrlRequest.client.getParameter(Integer.toString(18)); // L: 12849
			String var2 = UrlRequest.client.getParameter(Integer.toString(13)); // L: 12850
			String var3 = var1 + "settings=" + var0 + "; version=1; path=/; domain=" + var2; // L: 12851
			if (var0.length() == 0) { // L: 12852
				var3 = var3 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				var3 = var3 + "; Expires=" + RouteStrategy.method4398(VerticalAlignment.method3924() + 94608000000L) + "; Max-Age=" + 94608000L; // L: 12853
			}

			class26.method358(UrlRequest.client, "document.cookie=\"" + var3 + "\""); // L: 12854
		} catch (Throwable var4) { // L: 12856
		}

	} // L: 12857
}
