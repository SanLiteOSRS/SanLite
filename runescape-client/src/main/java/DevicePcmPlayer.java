import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("af")
@Implements("DevicePcmPlayer")
public class DevicePcmPlayer extends PcmPlayer {
	@ObfuscatedName("ac")
	@Export("format")
	AudioFormat format;
	@ObfuscatedName("al")
	@Export("line")
	SourceDataLine line;
	@ObfuscatedName("ak")
	@ObfuscatedGetter(
		intValue = 568247467
	)
	@Export("capacity2")
	int capacity2;
	@ObfuscatedName("ax")
	@Export("byteSamples")
	byte[] byteSamples;

	DevicePcmPlayer() {
	} // L: 18

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "1058566109"
	)
	@Export("init")
	public void init() {
		this.format = new AudioFormat((float)PcmPlayer.field306, 16, class306.PcmPlayer_stereo ? 2 : 1, true, false); // L: 22
		this.byteSamples = new byte[256 << (class306.PcmPlayer_stereo ? 2 : 1)]; // L: 23
	} // L: 24

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(IB)V",
		garbageValue = "1"
	)
	@Export("open")
	public void open(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (class306.PcmPlayer_stereo ? 2 : 1)); // L: 29
			this.line = (SourceDataLine)AudioSystem.getLine(var2); // L: 30
			this.line.open(); // L: 31
			this.line.start(); // L: 32
			this.capacity2 = var1; // L: 33
		} catch (LineUnavailableException var3) { // L: 35
			if (WorldMapLabel.method5653(var1) != 1) { // L: 36
				this.open(EnumComposition.method3749(var1)); // L: 37
			} else {
				this.line = null; // L: 40
				throw var3; // L: 41
			}
		}
	} // L: 38 43

	@ObfuscatedName("ak")
	@ObfuscatedSignature(
		descriptor = "(I)I",
		garbageValue = "-325041005"
	)
	@Export("position")
	protected int position() {
		return this.capacity2 - (this.line.available() >> (class306.PcmPlayer_stereo ? 2 : 1)); // L: 47
	}

	@ObfuscatedName("ax")
	@Export("write")
	protected void write() {
		int var1 = 256; // L: 53
		if (class306.PcmPlayer_stereo) { // L: 54
			var1 <<= 1;
		}

		for (int var2 = 0; var2 < var1; ++var2) { // L: 55
			int var3 = super.samples[var2]; // L: 56
			if ((var3 + 8388608 & -16777216) != 0) { // L: 57
				var3 = 8388607 ^ var3 >> 31; // L: 58
			}

			this.byteSamples[var2 * 2] = (byte)(var3 >> 8); // L: 60
			this.byteSamples[var2 * 2 + 1] = (byte)(var3 >> 16); // L: 61
		}

		this.line.write(this.byteSamples, 0, var1 << 1); // L: 63
	} // L: 64

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "3331"
	)
	@Export("close")
	protected void close() {
		if (this.line != null) { // L: 68
			this.line.close(); // L: 69
			this.line = null; // L: 70
		}

	} // L: 72

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "0"
	)
	@Export("discard")
	protected void discard() {
		this.line.flush(); // L: 76
	} // L: 77
}
