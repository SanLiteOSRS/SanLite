import java.util.concurrent.ThreadPoolExecutor;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("bh")
@Implements("SoundCache")
public class SoundCache {
	@ObfuscatedName("az")
	public static ThreadPoolExecutor field344;
	@ObfuscatedName("kt")
	@ObfuscatedSignature(
		descriptor = "Lud;"
	)
	@Export("redHintArrowSprite")
	static SpritePixels redHintArrowSprite;
	@ObfuscatedName("ul")
	@ObfuscatedSignature(
		descriptor = "Lcj;"
	)
	@Export("decimator")
	static Decimator decimator;
	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	@Export("soundEffectIndex")
	AbstractArchive soundEffectIndex;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lnd;"
	)
	AbstractArchive field339;
	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "Lsm;"
	)
	NodeHashTable field340;

	@ObfuscatedSignature(
		descriptor = "(Lnd;Lnd;)V"
	)
	public SoundCache(AbstractArchive var1, AbstractArchive var2) {
		new NodeHashTable(256); // L: 11
		this.field340 = new NodeHashTable(256); // L: 14
		this.soundEffectIndex = var1; // L: 17
		this.field339 = var2; // L: 18
	} // L: 19

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(II[II)Lbi;",
		garbageValue = "-446008293"
	)
	@Export("getSoundEffect0")
	RawSound getSoundEffect0(int var1, int var2, int[] var3) {
		long var4 = this.method861(var1, var2, false); // L: 22
		class53 var6 = (class53)this.field340.get(var4); // L: 23
		if (var6 != null) { // L: 24
			return var6.method1098();
		} else if (var3 != null && var3[0] <= 0) { // L: 25
			return null;
		} else {
			SoundEffect var7 = SoundEffect.readSoundEffect(this.soundEffectIndex, var1, var2); // L: 26
			if (var7 == null) { // L: 27
				return null;
			} else {
				RawSound var8 = var7.toRawSound(); // L: 28
				this.field340.put(new class53(var8), var4); // L: 29
				if (var3 != null) { // L: 30
					var3[0] -= var8.samples.length;
				}

				return var8; // L: 31
			}
		}
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(IIB)Lcf;",
		garbageValue = "45"
	)
	class53 method876(int var1, int var2) {
		long var3 = this.method861(var1, var2, true); // L: 35
		class53 var5 = (class53)this.field340.get(var3); // L: 36
		if (var5 != null) { // L: 37
			return var5; // L: 38
		} else {
			VorbisSample var6 = VorbisSample.readMusicSample(this.field339, var1, var2); // L: 40
			if (var6 == null) { // L: 41
				return new class53(); // L: 42
			} else {
				class53 var7 = new class53(var6); // L: 44
				this.field340.put(var7, var3); // L: 45
				return var7; // L: 46
			}
		}
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(I[II)Lbi;",
		garbageValue = "290841412"
	)
	@Export("getSoundEffect")
	RawSound getSoundEffect(int var1, int[] var2) {
		if (this.soundEffectIndex.getGroupCount() == 1) { // L: 50
			return this.getSoundEffect0(0, var1, var2);
		} else if (this.soundEffectIndex.getGroupFileCount(var1) == 1) {
			return this.getSoundEffect0(var1, 0, var2); // L: 51
		} else {
			throw new RuntimeException(); // L: 52
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lcf;",
		garbageValue = "-1226471323"
	)
	public class53 method868(int var1) {
		if (this.field339.getGroupCount() == 1) {
			return this.method876(0, var1);
		} else if (this.field339.getGroupFileCount(var1) == 1) { // L: 59
			return this.method876(var1, 0); // L: 60
		} else {
			throw new RuntimeException(); // L: 63
		}
	}

	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "(IS)Lbi;",
		garbageValue = "500"
	)
	public RawSound method860(int var1) {
		return this.getSoundEffect(var1, (int[])null); // L: 68
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(IIZI)J",
		garbageValue = "-167512765"
	)
	long method861(int var1, int var2, boolean var3) {
		int var4 = var2 ^ (var1 << 4 & 65535 | var1 >> 12); // L: 72
		var4 |= var1 << 16; // L: 73
		return var3 ? (long)var4 ^ 4294967296L : (long)var4; // L: 74 75 78
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "([BB)Ldc;",
		garbageValue = "60"
	)
	@Export("newScript")
	static Script newScript(byte[] var0) {
		Script var1 = new Script(); // L: 85
		Buffer var2 = new Buffer(var0); // L: 86
		var2.offset = var2.array.length - 2; // L: 87
		int var3 = var2.readUnsignedShort(); // L: 88
		int var4 = var2.array.length - 2 - var3 - 12; // L: 89
		var2.offset = var4; // L: 90
		int var5 = var2.readInt(); // L: 91
		var1.localIntCount = var2.readUnsignedShort(); // L: 92
		var1.localStringCount = var2.readUnsignedShort(); // L: 93
		var1.intArgumentCount = var2.readUnsignedShort(); // L: 94
		var1.stringArgumentCount = var2.readUnsignedShort(); // L: 95
		int var6 = var2.readUnsignedByte(); // L: 96
		int var7;
		int var8;
		if (var6 > 0) { // L: 97
			var1.switches = var1.newIterableNodeHashTable(var6); // L: 98

			for (var7 = 0; var7 < var6; ++var7) { // L: 99
				var8 = var2.readUnsignedShort(); // L: 100
				IterableNodeHashTable var9 = new IterableNodeHashTable(var8 > 0 ? UrlRequest.method2837(var8) : 1); // L: 101
				var1.switches[var7] = var9; // L: 102

				while (var8-- > 0) { // L: 103
					int var10 = var2.readInt(); // L: 104
					int var11 = var2.readInt(); // L: 105
					var9.put(new IntegerNode(var11), (long)var10); // L: 106
				}
			}
		}

		var2.offset = 0; // L: 110
		var1.field993 = var2.readStringCp1252NullTerminatedOrNull(); // L: 111
		var1.opcodes = new int[var5]; // L: 112
		var1.intOperands = new int[var5]; // L: 113
		var1.stringOperands = new String[var5]; // L: 114

		for (var7 = 0; var2.offset < var4; var1.opcodes[var7++] = var8) { // L: 115 116 121
			var8 = var2.readUnsignedShort(); // L: 117
			if (var8 == 3) { // L: 118
				var1.stringOperands[var7] = var2.readStringCp1252NullTerminated();
			} else if (var8 < 100 && var8 != 21 && var8 != 38 && var8 != 39) {
				var1.intOperands[var7] = var2.readInt(); // L: 119
			} else {
				var1.intOperands[var7] = var2.readUnsignedByte(); // L: 120
			}
		}

		return var1; // L: 123
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-29"
	)
	static void method857() {
		Messages.Messages_channels.clear(); // L: 54
		Messages.Messages_hashTable.clear(); // L: 55
		Messages.Messages_queue.clear(); // L: 56
		Messages.Messages_count = 0; // L: 57
	} // L: 58

	@ObfuscatedName("kj")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "104"
	)
	static final void method859(int var0) {
		if (var0 >= 0) { // L: 9343
			int var1 = Client.menuArguments1[var0]; // L: 9344
			int var2 = Client.menuArguments2[var0]; // L: 9345
			int var3 = Client.menuOpcodes[var0]; // L: 9346
			int var4 = Client.menuIdentifiers[var0]; // L: 9347
			int var5 = Client.field666[var0]; // L: 9348
			String var6 = Client.menuActions[var0]; // L: 9349
			String var7 = Client.menuTargets[var0]; // L: 9350
			class60.method1193(var1, var2, var3, var4, var5, var6, var7, MouseHandler.MouseHandler_lastPressedX, MouseHandler.MouseHandler_lastPressedY); // L: 9351
		}
	} // L: 9352

	@ObfuscatedName("lj")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-3"
	)
	@Export("Widget_runOnTargetLeave")
	static void Widget_runOnTargetLeave() {
		if (Client.isSpellSelected) { // L: 10066
			Widget var0 = MouseRecorder.getWidgetChild(class33.selectedSpellWidget, Client.selectedSpellChildIndex); // L: 10067
			if (var0 != null && var0.onTargetLeave != null) { // L: 10068
				ScriptEvent var1 = new ScriptEvent(); // L: 10069
				var1.widget = var0; // L: 10070
				var1.args = var0.onTargetLeave; // L: 10071
				GrandExchangeOfferOwnWorldComparator.runScriptEvent(var1); // L: 10072
			}

			Client.selectedSpellItemId = -1; // L: 10074
			Client.isSpellSelected = false; // L: 10075
			class200.invalidateWidget(var0); // L: 10076
		}
	} // L: 10077

	@ObfuscatedName("ly")
	@ObfuscatedSignature(
		descriptor = "([Lmt;Lmt;ZI)V",
		garbageValue = "1867193194"
	)
	@Export("revalidateWidgetScroll")
	static void revalidateWidgetScroll(Widget[] var0, Widget var1, boolean var2) {
		int var3 = var1.scrollWidth != 0 ? var1.scrollWidth : var1.width; // L: 11138
		int var4 = var1.scrollHeight != 0 ? var1.scrollHeight : var1.height; // L: 11139
		class36.resizeInterface(var0, var1.id, var3, var4, var2); // L: 11140
		if (var1.children != null) {
			class36.resizeInterface(var1.children, var1.id, var3, var4, var2); // L: 11141
		}

		InterfaceParent var5 = (InterfaceParent)Client.interfaceParents.get((long)var1.id); // L: 11142
		if (var5 != null) { // L: 11143
			int var6 = var5.group; // L: 11144
			if (Login.loadInterface(var6)) { // L: 11146
				class36.resizeInterface(ArchiveLoader.Widget_interfaceComponents[var6], -1, var3, var4, var2); // L: 11147
			}
		}

		if (var1.contentType == 1337) { // L: 11150
		}

	} // L: 11151
}
