import { Point } from "@/basic";

/**
 * 仿射矩阵
 * ｜a,c,e｜
 * ｜b,d,f｜
 * ｜0,0,1｜
 */
export class AffineMatrix {
  a: number = 1;
  b: number = 0;
  c: number = 0;
  d: number = 1;
  e: number = 0;
  f: number = 0;

  constructor() {}

  /**
   * 产生单位矩阵
   */
  static generateMatrix() {
    return new AffineMatrix();
  }

  /**
   * 旋转
   * @param angle。角度，以角度表示。0-180
   */
  rotate(angle: number): AffineMatrix {
    const rad = (angle / 180) * Math.PI;
    this.rotate2(rad);
    return this;
  }

  /**
   * 旋转
   * @param rad，以弧度表示。0-PI
   */

  rotate2(rad: number): AffineMatrix {
    this.a = Math.cos(rad);
    this.c = -Math.sin(rad);
    this.b = Math.sin(rad);
    this.d = Math.cos(rad);
    return this;
  }

  scale(sx:number,sy:number):AffineMatrix{
    this.a=sx;
    this.d=sy;
    return this;
  }

  /**
   * 平移
   * @param x
   * @param y
   */
  translate(x: number, y: number): AffineMatrix {
    this.e = x;
    this.f = y;
    return this;
  }

  /**
   * 右叉乘计算
   * @param matrix
   */
  crossProduct(matrix: AffineMatrix): AffineMatrix {
    const res = new AffineMatrix();
    res.a = this.a * matrix.a + this.c * matrix.b;
    res.c = this.a * matrix.c + this.c * matrix.d;
    res.e = this.a * matrix.e + this.c * matrix.f + this.e;

    res.b = this.b * matrix.a + this.d * matrix.b;
    res.d = this.b * matrix.c + this.d * matrix.d;
    res.f = this.b * matrix.e + this.d * matrix.f + this.f;
    return res;
  }

  /**
   * 对点p应用仿射变换
   * @param p
   */
  crossPoint(p: Point): Point {
    return new Point(
      this.a * p.x + this.c * p.y + this.e,
      this.b * p.x + this.d * p.y + this.f,
    );
  }
}
