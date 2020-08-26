import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("a")
public final class class13 {
	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(I)J",
		garbageValue = "-905483159"
	)
	static long method134() {
		try {
			URL var0 = new URL(HealthBarDefinition.method4563("services", false) + "m=accountappeal/login.ws");
			URLConnection var1 = var0.openConnection();
			var1.setRequestProperty("connection", "close");
			var1.setDoInput(true);
			var1.setDoOutput(true);
			var1.setConnectTimeout(5000);
			OutputStreamWriter var2 = new OutputStreamWriter(var1.getOutputStream());
			var2.write("data1=req");
			var2.flush();
			InputStream var3 = var1.getInputStream();
			Buffer var4 = new Buffer(new byte[1000]);

			do {
				int var5 = var3.read(var4.array, var4.offset, 1000 - var4.offset);
				if (var5 == -1) {
					var4.offset = 0;
					long var7 = var4.readLong();
					return var7;
				}

				var4.offset += var5;
			} while(var4.offset < 1000);

			return 0L;
		} catch (Exception var9) {
			return 0L;
		}
	}

	@ObfuscatedName("z")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "101"
	)
	public static int method129(int var0, int var1) {
		return (var0 << 8) + var1;
	}

	@ObfuscatedName("ge")
	@ObfuscatedSignature(
		signature = "(III)V",
		garbageValue = "347660061"
	)
	@Export("updateItemPile")
	static final void updateItemPile(int var0, int var1) {
		NodeDeque var2 = Client.groundItems[Huffman.Client_plane][var0][var1];
		if (var2 == null) {
			ScriptEvent.scene.removeGroundItemPile(Huffman.Client_plane, var0, var1);
		} else {
			long var3 = -99999999L;
			TileItem var5 = null;

			TileItem var6;
			for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
				ItemComposition var7 = GrandExchangeOfferTotalQuantityComparator.ItemDefinition_get(var6.id);
				long var8 = (long)var7.price;
				if (var7.isStackable == 1) {
					var8 *= (long)(var6.quantity + 1);
				}

				if (var8 > var3) {
					var3 = var8;
					var5 = var6;
				}
			}

			if (var5 == null) {
				ScriptEvent.scene.removeGroundItemPile(Huffman.Client_plane, var0, var1);
			} else {
				var2.addLast(var5);
				TileItem var12 = null;
				TileItem var11 = null;

				for (var6 = (TileItem)var2.last(); var6 != null; var6 = (TileItem)var2.previous()) {
					if (var6.id != var5.id) {
						if (var12 == null) {
							var12 = var6;
						}

						if (var6.id != var12.id && var11 == null) {
							var11 = var6;
						}
					}
				}

				long var9 = class227.calculateTag(var0, var1, 3, false, 0);
				ScriptEvent.scene.newGroundItemPile(Huffman.Client_plane, var0, var1, ArchiveLoader.getTileHeight(var0 * 128 + 64, var1 * 128 + 64, Huffman.Client_plane), var5, var9, var12, var11);
			}
		}
	}

	@ObfuscatedName("jq")
	@ObfuscatedSignature(
		signature = "(Lhq;IIB)V",
		garbageValue = "-96"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null) {
				Widget var4 = ReflectionCheck.method2381(var0);
				if (var4 == null) {
					var4 = var0.parent;
				}

				if (var4 != null) {
					Client.clickedWidget = var0;
					var4 = ReflectionCheck.method2381(var0);
					if (var4 == null) {
						var4 = var0.parent;
					}

					Client.clickedWidgetParent = var4;
					Client.widgetClickX = var1;
					Client.widgetClickY = var2;
					BoundaryObject.widgetDragDuration = 0;
					Client.isDraggingWidget = false;
					int var5 = GrandExchangeOffer.method209();
					if (var5 != -1) {
						ObjectSound.method1983(var5);
					}

					return;
				}
			}

		}
	}
}
