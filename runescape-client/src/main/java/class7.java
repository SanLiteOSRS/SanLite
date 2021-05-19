import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("v")
public class class7 extends class16 {
	@ObfuscatedName("r")
	@ObfuscatedSignature(
		descriptor = "Ljc;"
	)
	@Export("NetCache_currentResponse")
	static NetFileRequest NetCache_currentResponse;
	@ObfuscatedName("bz")
	@ObfuscatedSignature(
		descriptor = "Lkr;"
	)
	@Export("clientLanguage")
	static Language clientLanguage;
	@ObfuscatedName("ga")
	@ObfuscatedGetter(
		intValue = 460316475
	)
	static int field66;
	@ObfuscatedName("or")
	@ObfuscatedSignature(
		descriptor = "Lno;"
	)
	static class369 field60;
	@ObfuscatedName("h")
	String field59;
	@ObfuscatedName("c")
	byte field62;
	@ObfuscatedName("o")
	byte field61;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lm;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lm;)V"
	)
	class7(class19 var1) {
		this.this$0 = var1;
	}

	@ObfuscatedName("h")
	@ObfuscatedSignature(
		descriptor = "(Lnk;S)V",
		garbageValue = "4095"
	)
	void vmethod326(Buffer var1) {
		this.field59 = var1.readStringCp1252NullTerminatedOrNull();
		if (this.field59 != null) {
			var1.readUnsignedByte();
			this.field62 = var1.readByte();
			this.field61 = var1.readByte();
		}

	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(Lg;B)V",
		garbageValue = "-61"
	)
	void vmethod314(class3 var1) {
		var1.field38 = this.field59;
		if (this.field59 != null) {
			var1.field36 = this.field62;
			var1.field37 = this.field61;
		}

	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(Lcj;I)V",
		garbageValue = "2112804757"
	)
	static final void method87(Actor var0) {
		if (var0.field1261 != 0) {
			if (var0.targetIndex != -1) {
				Object var1 = null;
				if (var0.targetIndex < 32768) {
					var1 = Client.npcs[var0.targetIndex];
				} else if (var0.targetIndex >= 32768) {
					var1 = Client.players[var0.targetIndex - 32768];
				}

				if (var1 != null) {
					int var2 = var0.x - ((Actor)var1).x;
					int var3 = var0.y - ((Actor)var1).y;
					if (var2 != 0 || var3 != 0) {
						var0.orientation = (int)(Math.atan2((double)var2, (double)var3) * 325.949D) & 2047;
					}
				} else if (var0.false0) {
					var0.targetIndex = -1;
					var0.false0 = false;
				}
			}

			if (var0.field1247 != -1 && (var0.pathLength == 0 || var0.field1250 > 0)) {
				var0.orientation = var0.field1247;
				var0.field1247 = -1;
			}

			int var4 = var0.orientation - var0.rotation & 2047;
			if (var4 == 0 && var0.false0) {
				var0.targetIndex = -1;
				var0.false0 = false;
			}

			if (var4 != 0) {
				++var0.field1248;
				boolean var6;
				if (var4 > 1024) {
					var0.rotation -= var0.field1261;
					var6 = true;
					if (var4 < var0.field1261 || var4 > 2048 - var0.field1261) {
						var0.rotation = var0.orientation;
						var6 = false;
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field1248 > 25 || var6)) {
						if (var0.turnLeftSequence != -1) {
							var0.movementSequence = var0.turnLeftSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				} else {
					var0.rotation += var0.field1261;
					var6 = true;
					if (var4 < var0.field1261 || var4 > 2048 - var0.field1261) {
						var0.rotation = var0.orientation;
						var6 = false;
					}

					if (var0.movementSequence == var0.idleSequence && (var0.field1248 > 25 || var6)) {
						if (var0.turnRightSequence != -1) {
							var0.movementSequence = var0.turnRightSequence;
						} else {
							var0.movementSequence = var0.walkSequence;
						}
					}
				}

				var0.rotation &= 2047;
			} else {
				var0.field1248 = 0;
			}

		}
	}

	@ObfuscatedName("gu")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;ZI)V",
		garbageValue = "-1389420413"
	)
	@Export("drawLoadingMessage")
	static final void drawLoadingMessage(String var0, boolean var1) {
		if (Client.showLoadingMessages) {
			byte var2 = 4;
			int var3 = var2 + 6;
			int var4 = var2 + 6;
			int var5 = Message.fontPlain12.lineWidth(var0, 250);
			int var6 = Message.fontPlain12.lineCount(var0, 250) * 13;
			Rasterizer2D.Rasterizer2D_fillRectangle(var3 - var2, var4 - var2, var5 + var2 + var2, var6 + var2 + var2, 0);
			Rasterizer2D.Rasterizer2D_drawRectangle(var3 - var2, var4 - var2, var2 + var5 + var2, var2 + var6 + var2, 16777215);
			Message.fontPlain12.drawLines(var0, var3, var4, var5, var6, 16777215, -1, 1, 1, 0);
			class179.method3586(var3 - var2, var4 - var2, var2 + var2 + var5, var2 + var6 + var2);
			if (var1) {
				WorldMapDecorationType.rasterProvider.drawFull(0, 0);
			} else {
				int var7 = var3;
				int var8 = var4;
				int var9 = var5;
				int var10 = var6;

				for (int var11 = 0; var11 < Client.rootWidgetCount; ++var11) {
					if (Client.rootWidgetWidths[var11] + Client.rootWidgetXs[var11] > var7 && Client.rootWidgetXs[var11] < var7 + var9 && Client.rootWidgetYs[var11] + Client.rootWidgetHeights[var11] > var8 && Client.rootWidgetYs[var11] < var8 + var10) {
						Client.field826[var11] = true;
					}
				}
			}

		}
	}
}
