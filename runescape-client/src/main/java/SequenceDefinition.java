import java.io.DataInputStream;
import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("js")
@Implements("SequenceDefinition")
public class SequenceDefinition extends DualNode {
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("SequenceDefinition_archive")
	static AbstractArchive SequenceDefinition_archive;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("SequenceDefinition_animationsArchive")
	static AbstractArchive SequenceDefinition_animationsArchive;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("SequenceDefinition_skeletonsArchive")
	static AbstractArchive SequenceDefinition_skeletonsArchive;
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "Lex;"
	)
	@Export("SequenceDefinition_cached")
	public static EvictingDualNodeHashTable SequenceDefinition_cached;
	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "Lex;"
	)
	@Export("SequenceDefinition_cachedFrames")
	public static EvictingDualNodeHashTable SequenceDefinition_cachedFrames;
	@ObfuscatedName("h")
	@Export("frameIds")
	public int[] frameIds;
	@ObfuscatedName("z")
	@Export("chatFrameIds")
	int[] chatFrameIds;
	@ObfuscatedName("e")
	@Export("frameLengths")
	public int[] frameLengths;
	@ObfuscatedName("q")
	@Export("soundEffects")
	public int[] soundEffects;
	@ObfuscatedName("l")
	@ObfuscatedGetter(
		intValue = 1919989745
	)
	@Export("frameCount")
	public int frameCount;
	@ObfuscatedName("s")
	int[] field3552;
	@ObfuscatedName("b")
	public boolean field3559;
	@ObfuscatedName("a")
	@ObfuscatedGetter(
		intValue = 784302735
	)
	public int field3560;
	@ObfuscatedName("w")
	@ObfuscatedGetter(
		intValue = -1358417643
	)
	@Export("shield")
	public int shield;
	@ObfuscatedName("k")
	@ObfuscatedGetter(
		intValue = -625225869
	)
	@Export("weapon")
	public int weapon;
	@ObfuscatedName("i")
	@ObfuscatedGetter(
		intValue = 1105922697
	)
	public int field3563;
	@ObfuscatedName("x")
	@ObfuscatedGetter(
		intValue = -1806231631
	)
	public int field3564;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1659033173
	)
	public int field3565;
	@ObfuscatedName("g")
	@ObfuscatedGetter(
		intValue = 674051905
	)
	public int field3548;

	static {
		SequenceDefinition_cached = new EvictingDualNodeHashTable(64);
		SequenceDefinition_cachedFrames = new EvictingDualNodeHashTable(100);
	}

	SequenceDefinition() {
		this.frameCount = -1;
		this.field3559 = false;
		this.field3560 = 5;
		this.shield = -1;
		this.weapon = -1;
		this.field3563 = 99;
		this.field3564 = -1;
		this.field3565 = -1;
		this.field3548 = 2;
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(Lkx;I)V",
		garbageValue = "-1298412871"
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

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		signature = "(Lkx;II)V",
		garbageValue = "-1464269067"
	)
	@Export("decodeNext")
	void decodeNext(Buffer var1, int var2) {
		int var3;
		int var4;
		if (var2 == 1) {
			var3 = var1.readUnsignedShort();
			this.frameLengths = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameLengths[var4] = var1.readUnsignedShort();
			}

			this.frameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.frameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 2) {
			this.frameCount = var1.readUnsignedShort();
		} else if (var2 == 3) {
			var3 = var1.readUnsignedByte();
			this.field3552 = new int[var3 + 1];

			for (var4 = 0; var4 < var3; ++var4) {
				this.field3552[var4] = var1.readUnsignedByte();
			}

			this.field3552[var3] = 9999999;
		} else if (var2 == 4) {
			this.field3559 = true;
		} else if (var2 == 5) {
			this.field3560 = var1.readUnsignedByte();
		} else if (var2 == 6) {
			this.shield = var1.readUnsignedShort();
		} else if (var2 == 7) {
			this.weapon = var1.readUnsignedShort();
		} else if (var2 == 8) {
			this.field3563 = var1.readUnsignedByte();
		} else if (var2 == 9) {
			this.field3564 = var1.readUnsignedByte();
		} else if (var2 == 10) {
			this.field3565 = var1.readUnsignedByte();
		} else if (var2 == 11) {
			this.field3548 = var1.readUnsignedByte();
		} else if (var2 == 12) {
			var3 = var1.readUnsignedByte();
			this.chatFrameIds = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] = var1.readUnsignedShort();
			}

			for (var4 = 0; var4 < var3; ++var4) {
				this.chatFrameIds[var4] += var1.readUnsignedShort() << 16;
			}
		} else if (var2 == 13) {
			var3 = var1.readUnsignedByte();
			this.soundEffects = new int[var3];

			for (var4 = 0; var4 < var3; ++var4) {
				this.soundEffects[var4] = var1.readMedium();
			}
		}

	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		signature = "(B)V",
		garbageValue = "-49"
	)
	@Export("postDecode")
	void postDecode() {
		if (this.field3564 == -1) {
			if (this.field3552 != null) {
				this.field3564 = 2;
			} else {
				this.field3564 = 0;
			}
		}

		if (this.field3565 == -1) {
			if (this.field3552 != null) {
				this.field3565 = 2;
			} else {
				this.field3565 = 0;
			}
		}

	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		signature = "(Lef;II)Lef;",
		garbageValue = "2114263360"
	)
	@Export("transformActorModel")
	public Model transformActorModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = ClientPreferences.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Model var4 = var1.toSharedSequenceModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(Lef;IIS)Lef;",
		garbageValue = "-75"
	)
	@Export("transformObjectModel")
	Model transformObjectModel(Model var1, int var2, int var3) {
		var2 = this.frameIds[var2];
		Frames var4 = ClientPreferences.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var4 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Model var5 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var2));
			var3 &= 3;
			if (var3 == 1) {
				var5.rotateY270Ccw();
			} else if (var3 == 2) {
				var5.rotateY180();
			} else if (var3 == 3) {
				var5.rotateY90Ccw();
			}

			var5.animate(var4, var2);
			if (var3 == 1) {
				var5.rotateY90Ccw();
			} else if (var3 == 2) {
				var5.rotateY180();
			} else if (var3 == 3) {
				var5.rotateY270Ccw();
			}

			return var5;
		}
	}

	@ObfuscatedName("e")
	@ObfuscatedSignature(
		signature = "(Lef;IB)Lef;",
		garbageValue = "26"
	)
	@Export("transformSpotAnimationModel")
	Model transformSpotAnimationModel(Model var1, int var2) {
		var2 = this.frameIds[var2];
		Frames var3 = ClientPreferences.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var3 == null) {
			return var1.toSharedSpotAnimationModel(true);
		} else {
			Model var4 = var1.toSharedSpotAnimationModel(!var3.hasAlphaTransform(var2));
			var4.animate(var3, var2);
			return var4;
		}
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(
		signature = "(Lef;ILjs;II)Lef;",
		garbageValue = "-1897802113"
	)
	@Export("applyTransformations")
	public Model applyTransformations(Model var1, int var2, SequenceDefinition var3, int var4) {
		var2 = this.frameIds[var2];
		Frames var5 = ClientPreferences.getFrames(var2 >> 16);
		var2 &= 65535;
		if (var5 == null) {
			return var3.transformActorModel(var1, var4);
		} else {
			var4 = var3.frameIds[var4];
			Frames var6 = ClientPreferences.getFrames(var4 >> 16);
			var4 &= 65535;
			Model var7;
			if (var6 == null) {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2));
				var7.animate(var5, var2);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var5.hasAlphaTransform(var2) & !var6.hasAlphaTransform(var4));
				var7.animate2(var5, var2, var6, var4, this.field3552);
				return var7;
			}
		}
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(
		signature = "(Lef;II)Lef;",
		garbageValue = "620650049"
	)
	@Export("transformWidgetModel")
	public Model transformWidgetModel(Model var1, int var2) {
		int var3 = this.frameIds[var2];
		Frames var4 = ClientPreferences.getFrames(var3 >> 16);
		var3 &= 65535;
		if (var4 == null) {
			return var1.toSharedSequenceModel(true);
		} else {
			Frames var5 = null;
			int var6 = 0;
			if (this.chatFrameIds != null && var2 < this.chatFrameIds.length) {
				var6 = this.chatFrameIds[var2];
				var5 = ClientPreferences.getFrames(var6 >> 16);
				var6 &= 65535;
			}

			Model var7;
			if (var5 != null && var6 != 65535) {
				var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3) & !var5.hasAlphaTransform(var6));
				var7.animate(var4, var3);
				var7.animate(var5, var6);
				return var7;
			} else {
				var7 = var1.toSharedSequenceModel(!var4.hasAlphaTransform(var3));
				var7.animate(var4, var3);
				return var7;
			}
		}
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "(Ljava/lang/String;Ljava/lang/Throwable;B)V",
		garbageValue = "-109"
	)
	@Export("RunException_sendStackTrace")
	public static void RunException_sendStackTrace(String var0, Throwable var1) {
		if (var1 != null) {
			var1.printStackTrace();
		} else {
			try {
				String var2 = "";
				if (var1 != null) {
					var2 = class238.method4334(var1);
				}

				if (var0 != null) {
					if (var1 != null) {
						var2 = var2 + " | ";
					}

					var2 = var2 + var0;
				}

				System.out.println("Error: " + var2);
				var2 = var2.replace(':', '.');
				var2 = var2.replace('@', '_');
				var2 = var2.replace('&', '_');
				var2 = var2.replace('#', '_');
				if (RunException.RunException_applet == null) {
					return;
				}

				URL var3 = new URL(RunException.RunException_applet.getCodeBase(), "clienterror.ws?c=" + RunException.RunException_revision + "&u=" + class1.localPlayerName + "&v1=" + TaskHandler.javaVendor + "&v2=" + TaskHandler.javaVersion + "&ct=" + class217.clientType + "&e=" + var2);
				DataInputStream var4 = new DataInputStream(var3.openStream());
				var4.read();
				var4.close();
			} catch (Exception var5) {
			}

		}
	}
}
