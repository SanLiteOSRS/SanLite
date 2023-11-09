import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ay")
@Implements("MouseWheelHandler")
public final class MouseWheelHandler implements class174, MouseWheelListener {
	@ObfuscatedName("au")
	@ObfuscatedGetter(
		intValue = -489749087
	)
	@Export("rotation")
	int rotation;

	MouseWheelHandler() {
		this.rotation = 0; // L: 8
	} // L: 10

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;S)V",
		garbageValue = "-260"
	)
	@Export("addTo")
	void addTo(Component var1) {
		var1.addMouseWheelListener(this); // L: 13
	} // L: 14

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(Ljava/awt/Component;B)V",
		garbageValue = "0"
	)
	void method309(Component var1) {
		var1.removeMouseWheelListener(this); // L: 17
	} // L: 18

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-2061400252"
	)
	@Export("useRotation")
	public synchronized int useRotation() {
		int var1 = this.rotation; // L: 26
		this.rotation = 0; // L: 27
		return var1; // L: 28
	}

	public synchronized void mouseWheelMoved(MouseWheelEvent var1) {
		this.rotation += var1.getWheelRotation(); // L: 22
	} // L: 23
}
