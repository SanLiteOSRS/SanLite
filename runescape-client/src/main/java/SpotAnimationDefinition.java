import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fh")
@Implements("SpotAnimationDefinition")
public class SpotAnimationDefinition extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("SpotAnimationDefinition_archive")
	public static AbstractArchive SpotAnimationDefinition_archive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lln;"
	)
	@Export("SpotAnimationDefinition_modelArchive")
	public static AbstractArchive SpotAnimationDefinition_modelArchive;
	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("SpotAnimationDefinition_cached")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cached;
	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "Lig;"
	)
	@Export("SpotAnimationDefinition_cachedModels")
	public static EvictingDualNodeHashTable SpotAnimationDefinition_cachedModels;
	@ObfuscatedName("a")
	@ObfuscatedSignature(
		descriptor = "Lhh;"
	)
	@Export("worldMapEvent")
	static WorldMapEvent worldMapEvent;
	@ObfuscatedName("b")
	@ObfuscatedGetter(
		intValue = 2118158711
	)
	@Export("id")
	int id;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -751364127
	)
	@Export("archive")
	int archive;
	@ObfuscatedName("s")
	@ObfuscatedGetter(
		intValue = -1190458759
	)
	@Export("sequence")
	public int sequence;
	@ObfuscatedName("l")
	@Export("recolorFrom")
	short[] recolorFrom;
	@ObfuscatedName("q")
	@Export("recolorTo")
	short[] recolorTo;
	@ObfuscatedName("o")
	@Export("retextureFrom")
	short[] retextureFrom;
	@ObfuscatedName("r")
	@Export("retextureTo")
	short[] retextureTo;
	@ObfuscatedName("p")
	@ObfuscatedGetter(
		intValue = -1835946173
	)
	@Export("widthScale")
	int widthScale;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1714205519
	)
	@Export("heightScale")
	int heightScale;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = 870679975
	)
	@Export("orientation")
	int orientation;
	@ObfuscatedName("d")
	@ObfuscatedGetter(
		intValue = -1029966959
	)
	@Export("ambient")
	int ambient;
	@ObfuscatedName("m")
	@ObfuscatedGetter(
		intValue = -65447281
	)
	@Export("contrast")
	int contrast;

	static {
		SpotAnimationDefinition_cached = new EvictingDualNodeHashTable(64);
		SpotAnimationDefinition_cachedModels = new EvictingDualNodeHashTable(30);
	}

	SpotAnimationDefinition() {
		this.sequence = -1;
		this.widthScale = 128;
		this.heightScale = 128;
		this.orientation = 0;
		this.ambient = 0;
		this.contrast = 0;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lpi;I)V",
		garbageValue = "147710415"
	)
	@Export("decode")
	void decode(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.decodeNext(var1, var2);
		}
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(Lpi;II)V",
		garbageValue = "-1644410354"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		if (var2 == 1) {
			this.archive = var1.readUnsignedShort();
		} else if (var2 == 2) {
			this.sequence = var1.readUnsignedShort();
		} else if (var2 == 4) {
			this.widthScale = var1.readUnsignedShort();
		} else if (var2 == 5) {
			this.heightScale = var1.readUnsignedShort();
		} else if (var2 == 6) {
			this.orientation = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.ambient = var1.readUnsignedByte();
		} else if (var2 == 8) {
			this.contrast = var1.readUnsignedByte();
		} else {
			int var3;
			int var4;
			if (var2 == 40) {
				var3 = var1.readUnsignedByte();
				this.recolorFrom = new short[var3];
				this.recolorTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.recolorFrom[var4] = (short)var1.readUnsignedShort();
					this.recolorTo[var4] = (short)var1.readUnsignedShort();
				}
			} else if (var2 == 41) {
				var3 = var1.readUnsignedByte();
				this.retextureFrom = new short[var3];
				this.retextureTo = new short[var3];

				for (var4 = 0; var4 < var3; ++var4) {
					this.retextureFrom[var4] = (short)var1.readUnsignedShort();
					this.retextureTo[var4] = (short)var1.readUnsignedShort();
				}
			}
		}

	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(II)Liq;",
		garbageValue = "420896469"
	)
	@Export("getModel")
	public final Model getModel(int var1) {
		Model var2 = (Model)SpotAnimationDefinition_cachedModels.get((long)this.id);
		if (var2 == null) {
			ModelData var3 = ModelData.ModelData_get(SpotAnimationDefinition_modelArchive, this.archive, 0);
			if (var3 == null) {
				return null;
			}

			int var4;
			if (this.recolorFrom != null) {
				for (var4 = 0; var4 < this.recolorFrom.length; ++var4) {
					var3.recolor(this.recolorFrom[var4], this.recolorTo[var4]);
				}
			}

			if (this.retextureFrom != null) {
				for (var4 = 0; var4 < this.retextureFrom.length; ++var4) {
					var3.retexture(this.retextureFrom[var4], this.retextureTo[var4]);
				}
			}

			var2 = var3.toModel(this.ambient + 64, this.contrast + 850, -30, -50, -30);
			SpotAnimationDefinition_cachedModels.put(var2, (long)this.id);
		}

		Model var5;
		if (this.sequence != -1 && var1 != -1) {
			var5 = class163.SequenceDefinition_get(this.sequence).transformSpotAnimationModel(var2, var1);
		} else {
			var5 = var2.toSharedSpotAnimationModel(true);
		}

		if (this.widthScale != 128 || this.heightScale != 128) {
			var5.scale(this.widthScale, this.heightScale, this.widthScale);
		}

		if (this.orientation != 0) {
			if (this.orientation == 90) {
				var5.rotateY90Ccw();
			}

			if (this.orientation == 180) {
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
			}

			if (this.orientation == 270) {
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
				var5.rotateY90Ccw();
			}
		}

		return var5;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(I)[Lcs;",
		garbageValue = "-1958171328"
	)
	static class83[] method3549() {
		return new class83[]{class83.field1066, class83.field1061, class83.field1065, class83.field1064, class83.field1067, class83.field1062};
	}

	@ObfuscatedName("gh")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "356895140"
	)
	static final void method3545() {
		class13.method163(class93.field1253, PcmPlayer.field294, WorldMapElement.field1837);
		WorldMapSectionType.method4308(ObjectComposition.field2065, class21.field116);
		if (WorldMapLabelSize.cameraX == class93.field1253 && ItemContainer.cameraY == PcmPlayer.field294 && class154.cameraZ == WorldMapElement.field1837 && ObjectComposition.field2065 == class147.cameraPitch && class21.field116 == class21.cameraYaw) {
			Client.field754 = false;
			Client.isCameraLocked = false;
			class154.field1691 = 0;
			class67.field881 = 0;
			DevicePcmPlayerProvider.field154 = 0;
			NetFileRequest.field3960 = 0;
			class386.field4337 = 0;
			ArchiveDisk.field4309 = 0;
			Script.field955 = 0;
			class286.field3274 = 0;
			class54.field447 = 0;
			BZip2State.field4662 = 0;
		}

	}
}
