import java.math.BigInteger;
import java.util.Iterator;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("cq")
public class class89 {
	@ObfuscatedName("i")
	static final BigInteger field1161;
	@ObfuscatedName("o")
	static final BigInteger field1164;

	static {
		field1161 = new BigInteger("80782894952180643741752986186714059433953886149239752893425047584684715842049");
		field1164 = new BigInteger("7237300117305667488707183861728052766358166655052137727439795191253340127955075499635575104901523446809299097934591732635674173519120047404024393881551683");
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(I)V",
		garbageValue = "-1737643934"
	)
	static void method2127() {
		Iterator var0 = Messages.Messages_hashTable.iterator();

		while (var0.hasNext()) {
			Message var1 = (Message)var0.next();
			var1.clearIsFromFriend();
		}

	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "1760703138"
	)
	static void method2130(int var0) {
		Login.loginIndex = 12;
		Login.field1210 = var0;
	}

	@ObfuscatedName("fq")
	@ObfuscatedSignature(
		signature = "(II)V",
		garbageValue = "602324309"
	)
	@Export("forceDisconnect")
	static final void forceDisconnect(int var0) {
		ViewportMouse.logOut();
		switch(var0) {
		case 1:
			Login.loginIndex = 24;
			UrlRequester.setLoginResponseString("", "You were disconnected from the server.", "");
			break;
		case 2:
			GrandExchangeOfferTotalQuantityComparator.method169();
		}

	}

	@ObfuscatedName("gb")
	@ObfuscatedSignature(
		signature = "(IIIB)V",
		garbageValue = "-29"
	)
	@Export("worldToScreen")
	static final void worldToScreen(int var0, int var1, int var2) {
		if (var0 >= 128 && var1 >= 128 && var0 <= 13056 && var1 <= 13056) {
			int var3 = ArchiveLoader.getTileHeight(var0, var1, Huffman.Client_plane) - var2;
			var0 -= VertexNormal.cameraX;
			var3 -= FaceNormal.cameraY;
			var1 -= AbstractWorldMapData.cameraZ;
			int var4 = Rasterizer3D.Rasterizer3D_sine[PacketBuffer.cameraPitch];
			int var5 = Rasterizer3D.Rasterizer3D_cosine[PacketBuffer.cameraPitch];
			int var6 = Rasterizer3D.Rasterizer3D_sine[ServerPacket.cameraYaw];
			int var7 = Rasterizer3D.Rasterizer3D_cosine[ServerPacket.cameraYaw];
			int var8 = var6 * var1 + var0 * var7 >> 16;
			var1 = var7 * var1 - var0 * var6 >> 16;
			var0 = var8;
			var8 = var5 * var3 - var4 * var1 >> 16;
			var1 = var3 * var4 + var5 * var1 >> 16;
			if (var1 >= 50) {
				Client.viewportTempX = var0 * Client.viewportZoom / var1 + Client.viewportWidth / 2;
				Client.viewportTempY = Client.viewportHeight / 2 + var8 * Client.viewportZoom / var1;
			} else {
				Client.viewportTempX = -1;
				Client.viewportTempY = -1;
			}

		} else {
			Client.viewportTempX = -1;
			Client.viewportTempY = -1;
		}
	}
}
