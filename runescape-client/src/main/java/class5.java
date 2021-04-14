import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("e")
public class class5 extends class16 {
	@ObfuscatedName("re")
	@ObfuscatedGetter(
		intValue = 1071937152
	)
	static int field40;
	@ObfuscatedName("o")
	@Export("clearLoginScreen")
	static boolean clearLoginScreen;
	@ObfuscatedName("dp")
	@ObfuscatedSignature(
		signature = "Lig;"
	)
	@Export("archive3")
	static Archive archive3;
	@ObfuscatedName("ef")
	@ObfuscatedGetter(
		intValue = 2112256777
	)
	@Export("port3")
	static int port3;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1021832225
	)
	int field42;
	// $FF: synthetic field
	@ObfuscatedSignature(
		signature = "Lx;"
	)
	final class19 this$0;

	@ObfuscatedSignature(
		signature = "(Lx;)V"
	)
	class5(class19 var1) {
		this.this$0 = var1;
		this.field42 = -1;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(
		signature = "(Lnu;I)V",
		garbageValue = "-1239860939"
	)
	void vmethod356(Buffer var1) {
		this.field42 = var1.readUnsignedShort();
		var1.readUnsignedByte();
		if (var1.readUnsignedByte() != 255) {
			--var1.offset;
			var1.readLong();
		}

	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(Lp;I)V",
		garbageValue = "1583378087"
	)
	void vmethod352(class3 var1) {
		var1.method45(this.field42);
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(
		signature = "(ILlp;Lig;I)V",
		garbageValue = "1497398389"
	)
	static void method85(int var0, ArchiveDisk var1, Archive var2) {
		ArchiveDiskAction var3 = new ArchiveDiskAction();
		var3.type = 1;
		var3.key = (long)var0;
		var3.archiveDisk = var1;
		var3.archive = var2;
		synchronized(ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue) {
			ArchiveDiskActionHandler.ArchiveDiskActionHandler_requestQueue.addFirst(var3);
		}

		ItemLayer.method3271();
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(
		signature = "(IIB)I",
		garbageValue = "74"
	)
	static final int method83(int var0, int var1) {
		int var2 = class312.method5606(var0 - 1, var1 - 1) + class312.method5606(1 + var0, var1 - 1) + class312.method5606(var0 - 1, var1 + 1) + class312.method5606(var0 + 1, 1 + var1);
		int var3 = class312.method5606(var0 - 1, var1) + class312.method5606(1 + var0, var1) + class312.method5606(var0, var1 - 1) + class312.method5606(var0, var1 + 1);
		int var4 = class312.method5606(var0, var1);
		return var2 / 16 + var3 / 8 + var4 / 4;
	}

	@ObfuscatedName("jf")
	@ObfuscatedSignature(
		signature = "(IIIIIIIB)V",
		garbageValue = "52"
	)
	@Export("updateRootInterface")
	static final void updateRootInterface(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		if (class15.loadInterface(var0)) {
			GameObject.updateInterface(Widget.Widget_interfaceComponents[var0], -1, var1, var2, var3, var4, var5, var6);
		}
	}
}
