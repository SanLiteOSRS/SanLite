import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ml")
public class class333 {
	@ObfuscatedName("wf")
	@ObfuscatedGetter(
		intValue = -391930707
	)
	@Export("foundItemIndex")
	static int foundItemIndex;
	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "Loc;"
	)
	public AbstractArchive field3614;
	@ObfuscatedName("ah")
	@ObfuscatedGetter(
		intValue = 2141247955
	)
	public int field3605;
	@ObfuscatedName("af")
	@ObfuscatedGetter(
		intValue = -114208929
	)
	public int field3606;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1472570331
	)
	public int field3607;
	@ObfuscatedName("an")
	public float field3608;
	@ObfuscatedName("ao")
	public boolean field3609;
	@ObfuscatedName("ab")
	public boolean field3610;
	@ObfuscatedName("aw")
	public boolean field3617;
	@ObfuscatedName("ad")
	public boolean field3604;
	@ObfuscatedName("al")
	boolean field3612;
	@ObfuscatedName("as")
	@ObfuscatedSignature(
		descriptor = "Lmx;"
	)
	public MidiPcmStream field3613;
	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "Lbq;"
	)
	public SoundCache field3615;
	@ObfuscatedName("ai")
	@ObfuscatedSignature(
		descriptor = "Lmr;"
	)
	public MusicTrack field3616;

	@ObfuscatedSignature(
		descriptor = "(Loc;Ljava/lang/String;Ljava/lang/String;IZ)V"
	)
	public class333(AbstractArchive var1, String var2, String var3, int var4, boolean var5) {
		this.field3605 = -1;
		this.field3606 = -1;
		this.field3607 = 0;
		this.field3608 = 0.0F;
		this.field3609 = false;
		this.field3604 = false;
		this.field3612 = false;
		this.field3605 = var1.getGroupId(var2); // L: 22
		this.field3606 = var1.getFileId(this.field3605, var3); // L: 23
		this.method6239(var1, this.field3605, this.field3606, var4, var5); // L: 24
	} // L: 25

	@ObfuscatedSignature(
		descriptor = "(Loc;IIIZ)V"
	)
	public class333(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3605 = -1; // L: 8
		this.field3606 = -1; // L: 9
		this.field3607 = 0; // L: 10
		this.field3608 = 0.0F; // L: 11
		this.field3609 = false; // L: 12
		this.field3604 = false; // L: 15
		this.field3612 = false; // L: 16
		this.method6239(var1, var2, var3, var4, var5); // L: 28
	} // L: 29

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Loc;IIIZB)V",
		garbageValue = "3"
	)
	void method6239(AbstractArchive var1, int var2, int var3, int var4, boolean var5) {
		this.field3614 = var1; // L: 32
		this.field3605 = var2; // L: 33
		this.field3606 = var3; // L: 34
		this.field3607 = var4; // L: 35
		this.field3609 = var5; // L: 36
	} // L: 37

	@ObfuscatedName("ad")
	@ObfuscatedSignature(
		descriptor = "(II)I",
		garbageValue = "2138717915"
	)
	@Export("Messages_getLastChatID")
	static int Messages_getLastChatID(int var0) {
		Message var1 = (Message)Messages.Messages_hashTable.get((long)var0); // L: 70
		if (var1 == null) { // L: 71
			return -1;
		} else {
			return var1.previousDual == Messages.Messages_queue.sentinel ? -1 : ((Message)var1.previousDual).count; // L: 72 73
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-1606535135"
	)
	static int method6238(int var0, Script var1, boolean var2) {
		Widget var3 = var2 ? class475.scriptDotWidget : class535.field5236; // L: 1615
		if (var0 == ScriptOpcodes.CC_GETTARGETMASK) { // L: 1616
			Interpreter.Interpreter_intStack[++class19.Interpreter_intStackSize - 1] = class342.Widget_unpackTargetMask(class33.getWidgetFlags(var3)); // L: 1617
			return 1; // L: 1618
		} else if (var0 != ScriptOpcodes.CC_GETOP) { // L: 1620
			if (var0 == ScriptOpcodes.CC_GETOPBASE) { // L: 1627
				if (var3.dataText == null) { // L: 1628
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
				} else {
					Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3.dataText; // L: 1629
				}

				return 1; // L: 1630
			} else {
				return 2; // L: 1632
			}
		} else {
			int var4 = Interpreter.Interpreter_intStack[--class19.Interpreter_intStackSize]; // L: 1621
			--var4; // L: 1622
			if (var3.actions != null && var4 < var3.actions.length && var3.actions[var4] != null) { // L: 1623
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = var3.actions[var4]; // L: 1624
			} else {
				Interpreter.Interpreter_stringStack[++AbstractWorldMapIcon.Interpreter_stringStackSize - 1] = "";
			}

			return 1; // L: 1625
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(Lba;I)V",
		garbageValue = "1334168126"
	)
	@Export("PcmStream_disable")
	static final void PcmStream_disable(PcmStream var0) {
		var0.active = false; // L: 230
		if (var0.sound != null) { // L: 231
			var0.sound.position = 0;
		}

		for (PcmStream var1 = var0.firstSubStream(); var1 != null; var1 = var0.nextSubStream()) {
			PcmStream_disable(var1); // L: 232
		}

	} // L: 233
}
