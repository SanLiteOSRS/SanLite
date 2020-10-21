import java.net.URL;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eg")
@Implements("UrlRequest")
public class UrlRequest {
	@ObfuscatedName("f")
	@Export("url")
	final URL url;
	@ObfuscatedName("b")
	@Export("isDone0")
	volatile boolean isDone0;
	@ObfuscatedName("l")
	@Export("response0")
	volatile byte[] response0;

	UrlRequest(URL var1) {
		this.url = var1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(I)Z",
		garbageValue = "-225221070"
	)
	@Export("isDone")
	public boolean isDone() {
		return this.isDone0;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(
		signature = "(B)[B",
		garbageValue = "-126"
	)
	@Export("getResponse")
	public byte[] getResponse() {
		return this.response0;
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "118404213"
	)
	static void method3436() {
		Messages.Messages_channels.clear();
		Messages.Messages_hashTable.clear();
		Messages.Messages_queue.clear();
		Messages.Messages_count = 0;
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(
		signature = "(III)Z",
		garbageValue = "-697232655"
	)
	static final boolean method3437(int var0, int var1) {
		ObjectComposition var2 = ScriptEvent.getObjectDefinition(var0);
		if (var1 == 11) {
			var1 = 10;
		}

		if (var1 >= 5 && var1 <= 8) {
			var1 = 4;
		}

		return var2.method4764(var1);
	}

	@ObfuscatedName("jw")
	@ObfuscatedSignature(
		signature = "(IIIILlc;Lho;I)V",
		garbageValue = "1829625632"
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
			class219.redHintArrowSprite.method6303(var15 + (var0 + var5.width / 2 - var17 / 2), var5.height / 2 + var1 - var17 / 2 - var16 - 10, var17, var17, 15, 15, var12, 256);
		} else {
			TileItem.drawSpriteOnMinimap(var0, var1, var2, var3, var4, var5);
		}

	}
}
