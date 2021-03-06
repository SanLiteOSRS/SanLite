import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("WorldMapLabelSize")
public class WorldMapLabelSize {
	@ObfuscatedName("sx")
	@ObfuscatedGetter(
		intValue = 339414095
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		signature = "Lay;"
	)
	@Export("WorldMapLabelSize_small")
	public static final WorldMapLabelSize WorldMapLabelSize_small;
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		signature = "Lay;"
	)
	@Export("WorldMapLabelSize_medium")
	public static final WorldMapLabelSize WorldMapLabelSize_medium;
	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "Lay;"
	)
	@Export("WorldMapLabelSize_large")
	public static final WorldMapLabelSize WorldMapLabelSize_large;
	@ObfuscatedName("c")
	@ObfuscatedGetter(
		intValue = -2074270997
	)
	final int field149;
	@ObfuscatedName("y")
	@ObfuscatedGetter(
		intValue = 603088885
	)
	final int field153;
	@ObfuscatedName("h")
	@ObfuscatedGetter(
		intValue = 518486027
	)
	final int field154;

	static {
		WorldMapLabelSize_small = new WorldMapLabelSize(0, 0, 4);
		WorldMapLabelSize_medium = new WorldMapLabelSize(2, 1, 2);
		WorldMapLabelSize_large = new WorldMapLabelSize(1, 2, 0);
	}

	WorldMapLabelSize(int var1, int var2, int var3) {
		this.field149 = var1;
		this.field153 = var2;
		this.field154 = var3;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-67",
		signature = "(FB)Z"
	)
	boolean method255(float var1) {
		return var1 >= (float)this.field154;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		garbageValue = "-2106429153",
		signature = "(I)[Lay;"
	)
	static WorldMapLabelSize[] method269() {
		return new WorldMapLabelSize[]{WorldMapLabelSize_large, WorldMapLabelSize_medium, WorldMapLabelSize_small};
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(
		garbageValue = "-173751595",
		signature = "(Lig;III)[Llm;"
	)
	public static SpritePixels[] method268(AbstractArchive var0, int var1, int var2) {
		byte[] var4 = var0.takeFile(var1, var2);
		boolean var3;
		if (var4 == null) {
			var3 = false;
		} else {
			GrandExchangeOfferNameComparator.SpriteBuffer_decode(var4);
			var3 = true;
		}

		return !var3 ? null : BufferedSource.method6103();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		garbageValue = "31",
		signature = "(IB)Lay;"
	)
	static WorldMapLabelSize method266(int var0) {
		WorldMapLabelSize[] var1 = method269();

		for (int var2 = 0; var2 < var1.length; ++var2) {
			WorldMapLabelSize var3 = var1[var2];
			if (var0 == var3.field153) {
				return var3;
			}
		}

		return null;
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		garbageValue = "-1679154092",
		signature = "(IIIZIZI)V"
	)
	@Export("doWorldSorting")
	static void doWorldSorting(int var0, int var1, int var2, boolean var3, int var4, boolean var5) {
		if (var0 < var1) {
			int var6 = (var0 + var1) / 2;
			int var7 = var0;
			World var8 = World.World_worlds[var6];
			World.World_worlds[var6] = World.World_worlds[var1];
			World.World_worlds[var1] = var8;

			for (int var9 = var0; var9 < var1; ++var9) {
				if (class22.method226(World.World_worlds[var9], var8, var2, var3, var4, var5) <= 0) {
					World var10 = World.World_worlds[var9];
					World.World_worlds[var9] = World.World_worlds[var7];
					World.World_worlds[var7++] = var10;
				}
			}

			World.World_worlds[var1] = World.World_worlds[var7];
			World.World_worlds[var7] = var8;
			doWorldSorting(var0, var7 - 1, var2, var3, var4, var5);
			doWorldSorting(var7 + 1, var1, var2, var3, var4, var5);
		}

	}

	@ObfuscatedName("bp")
	@ObfuscatedSignature(
		garbageValue = "1534549931",
		signature = "(Ljava/lang/String;I)I"
	)
	@Export("stringCp1252NullTerminatedByteSize")
	public static int stringCp1252NullTerminatedByteSize(String var0) {
		return var0.length() + 1;
	}

	@ObfuscatedName("in")
	@ObfuscatedSignature(
		garbageValue = "1283328511",
		signature = "(IIIIII)V"
	)
	@Export("drawScrollBar")
	static final void drawScrollBar(int var0, int var1, int var2, int var3, int var4) {
		ObjectSound.scrollBarSprites[0].drawAt(var0, var1);
		ObjectSound.scrollBarSprites[1].drawAt(var0, var3 + var1 - 16);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var1 + 16, 16, var3 - 32, Client.field727);
		int var5 = var3 * (var3 - 32) / var4;
		if (var5 < 8) {
			var5 = 8;
		}

		int var6 = (var3 - 32 - var5) * var2 / (var4 - var3);
		Rasterizer2D.Rasterizer2D_fillRectangle(var0, var6 + var1 + 16, 16, var5, Client.field777);
		Rasterizer2D.method6232(var0, var6 + var1 + 16, var5, Client.field730);
		Rasterizer2D.method6232(var0 + 1, var6 + var1 + 16, var5, Client.field730);
		Rasterizer2D.method6223(var0, var6 + var1 + 16, 16, Client.field730);
		Rasterizer2D.method6223(var0, var6 + var1 + 17, 16, Client.field730);
		Rasterizer2D.method6232(var0 + 15, var6 + var1 + 16, var5, Client.field729);
		Rasterizer2D.method6232(var0 + 14, var6 + var1 + 17, var5 - 1, Client.field729);
		Rasterizer2D.method6223(var0, var6 + var5 + var1 + 15, 16, Client.field729);
		Rasterizer2D.method6223(var0 + 1, var6 + var5 + var1 + 14, 15, Client.field729);
	}

	@ObfuscatedName("ke")
	@ObfuscatedSignature(
		garbageValue = "-490308531",
		signature = "(Lhz;I)Z"
	)
	static final boolean method254(Widget var0) {
		int var1 = var0.contentType;
		if (var1 == 205) {
			Client.logoutTimer = 250;
			return true;
		} else {
			int var2;
			int var3;
			if (var1 >= 300 && var1 <= 313) {
				var2 = (var1 - 300) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.changeAppearance(var2, var3 == 1);
			}

			if (var1 >= 314 && var1 <= 323) {
				var2 = (var1 - 314) / 2;
				var3 = var1 & 1;
				Client.playerAppearance.method4206(var2, var3 == 1);
			}

			if (var1 == 324) {
				Client.playerAppearance.changeSex(false);
			}

			if (var1 == 325) {
				Client.playerAppearance.changeSex(true);
			}

			if (var1 == 326) {
				PacketBufferNode var4 = WorldMapSprite.getPacketBufferNode(ClientPacket.field2322, Client.packetWriter.isaacCipher);
				Client.playerAppearance.write(var4.packetBuffer);
				Client.packetWriter.addNode(var4);
				return true;
			} else {
				return false;
			}
		}
	}
}
