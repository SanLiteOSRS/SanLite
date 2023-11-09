import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dx")
@Implements("ScriptEvent")
public class ScriptEvent extends Node {
	@ObfuscatedName("aj")
	@Export("args")
	Object[] args;
	@ObfuscatedName("al")
	boolean field1046;
	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("widget")
	Widget widget;
	@ObfuscatedName("ab")
	@ObfuscatedGetter(
		intValue = -1215525673
	)
	@Export("mouseX")
	int mouseX;
	@ObfuscatedName("an")
	@ObfuscatedGetter(
		intValue = 1595874415
	)
	@Export("mouseY")
	int mouseY;
	@ObfuscatedName("ao")
	@ObfuscatedGetter(
		intValue = -1303853145
	)
	@Export("opIndex")
	int opIndex;
	@ObfuscatedName("av")
	@ObfuscatedSignature(
		descriptor = "Lmy;"
	)
	@Export("dragTarget")
	Widget dragTarget;
	@ObfuscatedName("aq")
	@ObfuscatedGetter(
		intValue = 1590198513
	)
	@Export("keyTyped")
	int keyTyped;
	@ObfuscatedName("ap")
	@ObfuscatedGetter(
		intValue = 2089751377
	)
	@Export("keyPressed")
	int keyPressed;
	@ObfuscatedName("ar")
	@Export("targetName")
	String targetName;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 1158325503
	)
	int field1051;
	@ObfuscatedName("ax")
	@ObfuscatedGetter(
		intValue = -948515929
	)
	@Export("type")
	int type;

	public ScriptEvent() {
		this.type = 76; // L: 19
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "([Ljava/lang/Object;I)V",
		garbageValue = "-1270007973"
	)
	@Export("setArgs")
	public void setArgs(Object[] var1) {
		this.args = var1; // L: 22
	} // L: 23

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)V",
		garbageValue = "1638695958"
	)
	@Export("setType")
	public void setType(int var1) {
		this.type = var1; // L: 26
	} // L: 27

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(Lmy;I)V",
		garbageValue = "-376683317"
	)
	public void method2260(Widget var1) {
		this.widget = var1; // L: 30
	} // L: 31

	@ObfuscatedName("hq")
	@ObfuscatedSignature(
		descriptor = "(Ldq;IB)V",
		garbageValue = "106"
	)
	@Export("updateActorSequence")
	static final void updateActorSequence(Actor var0, int var1) {
		if (var0.field1196 >= Client.cycle) { // L: 3888
			int var2 = Math.max(1, var0.field1196 - Client.cycle); // L: 3889
			int var3 = var0.field1142 * -1172500480 + var0.field1192 * 128; // L: 3890
			int var4 = var0.field1142 * -1172500480 + var0.field1194 * 128; // L: 3891
			var0.x += (var3 - var0.x) / var2; // L: 3892
			var0.y += (var4 - var0.y) / var2; // L: 3893
			var0.field1214 = 0; // L: 3894
			var0.orientation = var0.field1162; // L: 3895
		} else if (var0.field1197 >= Client.cycle) { // L: 3897
			class6.method37(var0);
		} else {
			class18.method273(var0); // L: 3898
		}

		if (var0.x < 128 || var0.y < 128 || var0.x >= 13184 || var0.y >= 13184) { // L: 3899
			var0.sequence = -1; // L: 3900
			var0.spotAnimation = -1; // L: 3901
			var0.field1196 = 0; // L: 3902
			var0.field1197 = 0; // L: 3903
			var0.x = var0.field1142 * -1172500480 + var0.pathX[0] * 128; // L: 3904
			var0.y = var0.field1142 * -1172500480 + var0.pathY[0] * 128; // L: 3905
			var0.method2371(); // L: 3906
		}

		if (BuddyRankComparator.localPlayer == var0 && (var0.x < 1536 || var0.y < 1536 || var0.x >= 11776 || var0.y >= 11776)) { // L: 3908 3909
			var0.sequence = -1; // L: 3910
			var0.spotAnimation = -1; // L: 3911
			var0.field1196 = 0; // L: 3912
			var0.field1197 = 0; // L: 3913
			var0.x = var0.field1142 * -1172500480 + var0.pathX[0] * 128; // L: 3914
			var0.y = var0.field1142 * -1172500480 + var0.pathY[0] * 128; // L: 3915
			var0.method2371(); // L: 3916
		}

		MenuAction.method2054(var0); // L: 3919
		class13.method154(var0); // L: 3920
	} // L: 3921
}
