import java.io.IOException;
import java.util.concurrent.Callable;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
public class class19 implements Callable {
	@ObfuscatedName("fe")
	@ObfuscatedSignature(
		descriptor = "Lng;"
	)
	static Archive field90;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lab;"
	)
	final class10 field93;
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lag;"
	)
	final class14 this$0;

	@ObfuscatedSignature(
		descriptor = "(Lag;Lab;)V"
	)
	class19(class14 var1, class10 var2) {
		this.this$0 = var1; // L: 46
		this.field93 = var2; // L: 47
	} // L: 48

	public Object call() throws Exception {
		try {
			while (this.field93.method92()) { // L: 53
				class9.method82(10L); // L: 54
			}
		} catch (IOException var2) { // L: 57
			return new class20("Error servicing REST query: " + var2.getMessage()); // L: 58
		}

		return this.field93.method93(); // L: 60
	}

	@ObfuscatedName("gs")
	@ObfuscatedSignature(
		descriptor = "(B)Z",
		garbageValue = "6"
	)
	static boolean method307() {
		if (Client.archiveLoaders != null && Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1537
			while (Client.archiveLoadersDone < Client.archiveLoaders.size()) { // L: 1538
				ArchiveLoader var0 = (ArchiveLoader)Client.archiveLoaders.get(Client.archiveLoadersDone); // L: 1539
				if (!var0.isLoaded()) {
					return false; // L: 1540
				}

				++Client.archiveLoadersDone; // L: 1541
			}

			return true; // L: 1543
		} else {
			return true; // L: 1542
		}
	}

	@ObfuscatedName("np")
	@ObfuscatedSignature(
		descriptor = "(Lme;I)I",
		garbageValue = "1531306125"
	)
	@Export("getWidgetFlags")
	static int getWidgetFlags(Widget var0) {
		IntegerNode var1 = (IntegerNode)Client.widgetFlags.get(((long)var0.id << 32) + (long)var0.childIndex); // L: 12668
		return var1 != null ? var1.integer : var0.flags; // L: 12669 12670
	}
}
