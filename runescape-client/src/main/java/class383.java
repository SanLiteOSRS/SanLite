import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("nn")
public class class383 {
	@ObfuscatedName("s")
	static final char[] field4236;
	@ObfuscatedName("a")
	static final char[] field4237;

	static {
		field4236 = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
		field4237 = new char[]{'[', ']', '#'};
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(
		descriptor = "(ILjava/lang/String;Lkz;II)Lib;",
		garbageValue = "287793212"
	)
	public static PacketBufferNode method6755(int var0, String var1, Language var2, int var3) {
		PacketBufferNode var4 = AbstractWorldMapData.getPacketBufferNode(ClientPacket.field2759, Client.packetWriter.isaacCipher);
		var4.packetBuffer.writeByte(0);
		int var5 = var4.packetBuffer.offset;
		var4.packetBuffer.writeByte(var0);
		String var6 = var1.toLowerCase();
		byte var7 = 0;
		if (var6.startsWith("yellow:")) {
			var7 = 0;
			var1 = var1.substring("yellow:".length());
		} else if (var6.startsWith("red:")) {
			var7 = 1;
			var1 = var1.substring("red:".length());
		} else if (var6.startsWith("green:")) {
			var7 = 2;
			var1 = var1.substring("green:".length());
		} else if (var6.startsWith("cyan:")) {
			var7 = 3;
			var1 = var1.substring("cyan:".length());
		} else if (var6.startsWith("purple:")) {
			var7 = 4;
			var1 = var1.substring("purple:".length());
		} else if (var6.startsWith("white:")) {
			var7 = 5;
			var1 = var1.substring("white:".length());
		} else if (var6.startsWith("flash1:")) {
			var7 = 6;
			var1 = var1.substring("flash1:".length());
		} else if (var6.startsWith("flash2:")) {
			var7 = 7;
			var1 = var1.substring("flash2:".length());
		} else if (var6.startsWith("flash3:")) {
			var7 = 8;
			var1 = var1.substring("flash3:".length());
		} else if (var6.startsWith("glow1:")) {
			var7 = 9;
			var1 = var1.substring("glow1:".length());
		} else if (var6.startsWith("glow2:")) {
			var7 = 10;
			var1 = var1.substring("glow2:".length());
		} else if (var6.startsWith("glow3:")) {
			var7 = 11;
			var1 = var1.substring("glow3:".length());
		} else if (var2 != Language.Language_EN) {
			if (var6.startsWith("yellow:")) {
				var7 = 0;
				var1 = var1.substring("yellow:".length());
			} else if (var6.startsWith("red:")) {
				var7 = 1;
				var1 = var1.substring("red:".length());
			} else if (var6.startsWith("green:")) {
				var7 = 2;
				var1 = var1.substring("green:".length());
			} else if (var6.startsWith("cyan:")) {
				var7 = 3;
				var1 = var1.substring("cyan:".length());
			} else if (var6.startsWith("purple:")) {
				var7 = 4;
				var1 = var1.substring("purple:".length());
			} else if (var6.startsWith("white:")) {
				var7 = 5;
				var1 = var1.substring("white:".length());
			} else if (var6.startsWith("flash1:")) {
				var7 = 6;
				var1 = var1.substring("flash1:".length());
			} else if (var6.startsWith("flash2:")) {
				var7 = 7;
				var1 = var1.substring("flash2:".length());
			} else if (var6.startsWith("flash3:")) {
				var7 = 8;
				var1 = var1.substring("flash3:".length());
			} else if (var6.startsWith("glow1:")) {
				var7 = 9;
				var1 = var1.substring("glow1:".length());
			} else if (var6.startsWith("glow2:")) {
				var7 = 10;
				var1 = var1.substring("glow2:".length());
			} else if (var6.startsWith("glow3:")) {
				var7 = 11;
				var1 = var1.substring("glow3:".length());
			}
		}

		var6 = var1.toLowerCase();
		byte var8 = 0;
		if (var6.startsWith("wave:")) {
			var8 = 1;
			var1 = var1.substring("wave:".length());
		} else if (var6.startsWith("wave2:")) {
			var8 = 2;
			var1 = var1.substring("wave2:".length());
		} else if (var6.startsWith("shake:")) {
			var8 = 3;
			var1 = var1.substring("shake:".length());
		} else if (var6.startsWith("scroll:")) {
			var8 = 4;
			var1 = var1.substring("scroll:".length());
		} else if (var6.startsWith("slide:")) {
			var8 = 5;
			var1 = var1.substring("slide:".length());
		} else if (var2 != Language.Language_EN) {
			if (var6.startsWith("wave:")) {
				var8 = 1;
				var1 = var1.substring("wave:".length());
			} else if (var6.startsWith("wave2:")) {
				var8 = 2;
				var1 = var1.substring("wave2:".length());
			} else if (var6.startsWith("shake:")) {
				var8 = 3;
				var1 = var1.substring("shake:".length());
			} else if (var6.startsWith("scroll:")) {
				var8 = 4;
				var1 = var1.substring("scroll:".length());
			} else if (var6.startsWith("slide:")) {
				var8 = 5;
				var1 = var1.substring("slide:".length());
			}
		}

		var4.packetBuffer.writeByte(var7);
		var4.packetBuffer.writeByte(var8);
		class132.method2769(var4.packetBuffer, var1);
		if (var0 == class269.field3220.rsOrdinal()) {
			var4.packetBuffer.writeByte(var3);
		}

		var4.packetBuffer.method6963(var4.packetBuffer.offset - var5);
		return var4;
	}

	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "(IIIILow;Liw;I)V",
		garbageValue = "-1849354153"
	)
	@Export("worldToMinimap")
	static final void worldToMinimap(int var0, int var1, int var2, int var3, SpritePixels var4, SpriteMask var5) {
		int var6 = var3 * var3 + var2 * var2;
		if (var6 > 4225 && var6 < 90000) {
			int var7 = Client.camAngleY & 2047;
			int var8 = Rasterizer3D.Rasterizer3D_sine[var7];
			int var9 = Rasterizer3D.Rasterizer3D_cosine[var7];
			int var10 = var9 * var2 + var3 * var8 >> 16;
			int var11 = var3 * var9 - var8 * var2 >> 16;
			double var12 = Math.atan2((double)var10, (double)var11);
			int var14 = var5.width / 2 - 25;
			int var15 = (int)(Math.sin(var12) * (double)var14);
			int var16 = (int)(Math.cos(var12) * (double)var14);
			byte var17 = 20;
			BoundaryObject.redHintArrowSprite.method7384(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			WorldMapDecoration.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
