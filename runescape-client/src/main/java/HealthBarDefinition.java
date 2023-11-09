import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("gi")
@Implements("HealthBarDefinition")
public class HealthBarDefinition extends DualNode {
	@ObfuscatedName("w")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	static AbstractArchive field1985;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("HealthBarDefinition_cached")
	static EvictingDualNodeHashTable HealthBarDefinition_cached;
	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "Lja;"
	)
	@Export("HealthBarDefinition_cachedSprites")
	static EvictingDualNodeHashTable HealthBarDefinition_cachedSprites;
	@ObfuscatedName("z")
	@ObfuscatedGetter(
		intValue = 340088571
	)
	public int field1982;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = 610863041
	)
	@Export("int1")
	public int int1;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 485061889
	)
	@Export("int2")
	public int int2;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 1538861117
	)
	@Export("int3")
	public int int3;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = 1759495171
	)
	public int field1984;
	@ObfuscatedName("r")
	@ObfuscatedGetter(
		intValue = -496661429
	)
	@Export("int5")
	public int int5;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = -515352613
	)
	@Export("frontSpriteID")
	int frontSpriteID;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -697159111
	)
	@Export("backSpriteID")
	int backSpriteID;
	@ObfuscatedName("t")
	@ObfuscatedGetter(
		intValue = 742840403
	)
	@Export("width")
	public int width;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 2118917585
	)
	@Export("widthPadding")
	public int widthPadding;

	static {
		HealthBarDefinition_cached = new EvictingDualNodeHashTable(64); // L: 14
		HealthBarDefinition_cachedSprites = new EvictingDualNodeHashTable(64); // L: 15
	}

	HealthBarDefinition() {
		this.int1 = 255; // L: 19
		this.int2 = 255; // L: 20
		this.int3 = -1; // L: 21
		this.field1984 = 1; // L: 22
		this.int5 = 70; // L: 23
		this.frontSpriteID = -1; // L: 24
		this.backSpriteID = -1; // L: 25
		this.width = 30; // L: 26
		this.widthPadding = 0; // L: 27
	} // L: 29

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "(Lrd;I)V",
		garbageValue = "-2019372676"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte(); // L: 48
			if (var2 == 0) { // L: 49
				return; // L: 52
			}

			this.decodeNext(var1, var2); // L: 50
		}
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(
		descriptor = "(Lrd;II)V",
		garbageValue = "655885225"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) { // L: 55
			var1.readUnsignedShort(); // L: 56
		} else if (var2 == 2) { // L: 58
			this.int1 = var1.readUnsignedByte();
		} else if (var2 == 3) { // L: 59
			this.int2 = var1.readUnsignedByte();
		} else if (var2 == 4) { // L: 60
			this.int3 = 0;
		} else if (var2 == 5) {
			this.int5 = var1.readUnsignedShort(); // L: 61
		} else if (var2 == 6) { // L: 62
			var1.readUnsignedByte(); // L: 63
		} else if (var2 == 7) { // L: 65
			this.frontSpriteID = var1.method8709();
		} else if (var2 == 8) { // L: 66
			this.backSpriteID = var1.method8709();
		} else if (var2 == 11) {
			this.int3 = var1.readUnsignedShort(); // L: 67
		} else if (var2 == 14) { // L: 68
			this.width = var1.readUnsignedByte();
		} else if (var2 == 15) { // L: 69
			this.widthPadding = var1.readUnsignedByte();
		}

	} // L: 71

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		descriptor = "(I)Lrs;",
		garbageValue = "-350000117"
	)
	public SpritePixels method3675() {
		if (this.frontSpriteID < 0) { // L: 74
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.frontSpriteID); // L: 75
			if (var1 != null) {
				return var1; // L: 76
			} else {
				var1 = BZip2State.SpriteBuffer_getSprite(field1985, this.frontSpriteID, 0); // L: 77
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.frontSpriteID); // L: 78
				}

				return var1; // L: 80
			}
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)Lrs;",
		garbageValue = "-1607255134"
	)
	public SpritePixels method3666() {
		if (this.backSpriteID < 0) { // L: 84
			return null;
		} else {
			SpritePixels var1 = (SpritePixels)HealthBarDefinition_cachedSprites.get((long)this.backSpriteID); // L: 85
			if (var1 != null) {
				return var1; // L: 86
			} else {
				var1 = BZip2State.SpriteBuffer_getSprite(field1985, this.backSpriteID, 0); // L: 87
				if (var1 != null) {
					HealthBarDefinition_cachedSprites.put(var1, (long)this.backSpriteID); // L: 88
				}

				return var1; // L: 90
			}
		}
	}

	@ObfuscatedName("ff")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "75"
	)
	@Export("logOut")
	static final void logOut() {
		Client.packetWriter.close(); // L: 3130
		WorldMapElement.method3612(); // L: 3132
		FloorUnderlayDefinition.FloorUnderlayDefinition_cached.clear(); // L: 3134
		class134.method3124(); // L: 3136
		ObjectComposition.ObjectDefinition_cached.clear(); // L: 3138
		ObjectComposition.ObjectDefinition_cachedModelData.clear(); // L: 3139
		ObjectComposition.ObjectDefinition_cachedEntities.clear(); // L: 3140
		ObjectComposition.ObjectDefinition_cachedModels.clear(); // L: 3141
		class168.method3488(); // L: 3143
		TaskHandler.method3475(); // L: 3144
		ObjectSound.method1920(); // L: 3145
		SpotAnimationDefinition.SpotAnimationDefinition_cached.clear(); // L: 3147
		SpotAnimationDefinition.SpotAnimationDefinition_cachedModels.clear(); // L: 3148
		WorldMapDecorationType.method6425(); // L: 3150
		FaceNormal.method4641(); // L: 3151
		class491.HitSplatDefinition_cachedSprites.method8463(); // L: 3152
		class208.Ignored_cached.method8463(); // L: 3153
		HitSplatDefinition.HitSplatDefinition_cached.clear(); // L: 3155
		HitSplatDefinition.HitSplatDefinition_cachedSprites.clear(); // L: 3156
		HitSplatDefinition.HitSplatDefinition_cachedFonts.clear(); // L: 3157
		class31.method460(); // L: 3159
		UrlRequest.method2891(); // L: 3160
		ParamComposition.ParamComposition_cached.clear(); // L: 3162
		class85.method2339(); // L: 3164
		class466.DBTableType_cache.clear(); // L: 3166
		class468.DBRowType_cache.clear(); // L: 3169
		Client.Widget_cachedModels.clear(); // L: 3171
		Client.Widget_cachedFonts.clear(); // L: 3172
		VertexNormal.method4843(); // L: 3173
		Widget.Widget_cachedSprites.clear(); // L: 3175
		Widget.Widget_cachedModels.clear(); // L: 3176
		Widget.Widget_cachedFonts.clear(); // L: 3177
		Widget.Widget_cachedSpriteMasks.clear(); // L: 3178
		((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).clear(); // L: 3180
		Script.Script_cached.clear(); // L: 3181
		Client.archive5.method7487(); // L: 3182
		class13.field70.clearFiles(); // L: 3183
		FriendsChatManager.archive7.clearFiles(); // L: 3184
		class144.archive4.clearFiles(); // L: 3185
		DynamicObject.archive9.clearFiles(); // L: 3186
		NetCache.field4260.clearFiles(); // L: 3187
		class153.archive6.clearFiles(); // L: 3188
		class151.archive11.clearFiles(); // L: 3189
		WorldMapEvent.archive8.clearFiles(); // L: 3190
		class148.archive10.clearFiles(); // L: 3191
		ApproximateRouteStrategy.field490.clearFiles(); // L: 3192
		MusicPatchNode.field3448.clearFiles(); // L: 3193
		class12.archive12.clearFiles(); // L: 3194
		Canvas.field132.clearFiles(); // L: 3195
		WorldMapAreaData.scene.clear(); // L: 3197

		for (int var0 = 0; var0 < 4; ++var0) { // L: 3198
			Client.collisionMaps[var0].clear();
		}

		Client.field752.method4097(); // L: 3199
		System.gc(); // L: 3200
		KeyHandler.method430(2); // L: 3201
		Client.currentTrackGroupId = -1; // L: 3202
		Client.playingJingle = false; // L: 3203
		UserComparator4.method2902(); // L: 3204
		class246.method5251(10); // L: 3205
	} // L: 3206
}
