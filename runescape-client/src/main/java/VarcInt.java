import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ej")
@Implements("VarcInt")
public class VarcInt extends DualNode {
	@ObfuscatedName("v")
	@ObfuscatedSignature(
		descriptor = "Ljv;"
	)
	@Export("VarcInt_archive")
	static AbstractArchive VarcInt_archive;
	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "Lhz;"
	)
	@Export("VarcInt_cached")
	static EvictingDualNodeHashTable VarcInt_cached;
	@ObfuscatedName("f")
	@Export("persist")
	public boolean persist;

	static {
		VarcInt_cached = new EvictingDualNodeHashTable(64);
	}

	VarcInt() {
		this.persist = false;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		descriptor = "(Lnd;B)V",
		garbageValue = "-17"
	)
	void method2656(Buffer var1) {
		while (true) {
			int var2 = var1.readUnsignedByte();
			if (var2 == 0) {
				return;
			}

			this.method2666(var1, var2);
		}
	}

	@ObfuscatedName("y")
	@ObfuscatedSignature(
		descriptor = "(Lnd;IB)V",
		garbageValue = "34"
	)
	void method2666(Buffer var1, int var2) {
		if (var2 == 2) {
			this.persist = true;
		}

	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(
		descriptor = "(IS)Les;",
		garbageValue = "-9783"
	)
	@Export("SpotAnimationDefinition_get")
	public static SpotAnimationDefinition SpotAnimationDefinition_get(int var0) {
		SpotAnimationDefinition var1 = (SpotAnimationDefinition)SpotAnimationDefinition.SpotAnimationDefinition_cached.get((long)var0);
		if (var1 != null) {
			return var1;
		} else {
			byte[] var2 = SpotAnimationDefinition.SpotAnimationDefinition_archive.takeFile(13, var0);
			var1 = new SpotAnimationDefinition();
			var1.id = var0;
			if (var2 != null) {
				var1.decode(new Buffer(var2));
			}

			SpotAnimationDefinition.SpotAnimationDefinition_cached.put(var1, (long)var0);
			return var1;
		}
	}

	@ObfuscatedName("j")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1100714076"
	)
	public static void method2673() {
		if (NetCache.NetCache_socket != null) {
			NetCache.NetCache_socket.close();
		}

	}

	@ObfuscatedName("jc")
	@ObfuscatedSignature(
		descriptor = "(Lio;IIB)V",
		garbageValue = "8"
	)
	@Export("clickWidget")
	static final void clickWidget(Widget var0, int var1, int var2) {
		if (Client.clickedWidget == null && !Client.isMenuOpen) {
			if (var0 != null && class11.method125(var0) != null) {
				Client.clickedWidget = var0;
				Client.clickedWidgetParent = class11.method125(var0);
				Client.widgetClickX = var1;
				Client.widgetClickY = var2;
				Actor.widgetDragDuration = 0;
				Client.isDraggingWidget = false;
				int var3 = MilliClock.method2588();
				if (var3 != -1) {
					ReflectionCheck.tempMenuAction = new MenuAction();
					ReflectionCheck.tempMenuAction.param0 = Client.menuArguments1[var3];
					ReflectionCheck.tempMenuAction.param1 = Client.menuArguments2[var3];
					ReflectionCheck.tempMenuAction.opcode = Client.menuOpcodes[var3];
					ReflectionCheck.tempMenuAction.identifier = Client.menuIdentifiers[var3];
					ReflectionCheck.tempMenuAction.action = Client.menuActions[var3];
				}

			}
		}
	}
}
